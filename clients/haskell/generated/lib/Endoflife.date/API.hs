{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module Endoflife.date.API
  ( -- * Client and Server
    Config(..)
  , Endoflife.dateBackend(..)
  , createEndoflife.dateClient
  , runEndoflife.dateServer
  , runEndoflife.dateMiddlewareServer
  , runEndoflife.dateClient
  , runEndoflife.dateClientWithManager
  , callEndoflife.date
  , Endoflife.dateClient
  , Endoflife.dateClientError(..)
  -- ** Servant
  , Endoflife.dateAPI
  -- ** Plain WAI Application
  , serverWaiApplicationEndoflife.date
  ) where

import           Endoflife.date.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import qualified Data.Aeson                         as Aeson
import qualified Data.ByteString.Lazy               as BSL
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import qualified Data.Text.Encoding                 as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serveWithContextT)
import           Servant.API                        hiding (addHeader)
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context (EmptyContext))
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList

newtype JSONQueryParam a = JSONQueryParam
  { fromJsonQueryParam :: a
  } deriving (Functor, Foldable, Traversable)

instance Aeson.ToJSON a => ToHttpApiData (JSONQueryParam a) where
  toQueryParam = T.decodeUtf8 . BSL.toStrict . Aeson.encode . fromJsonQueryParam

instance Aeson.FromJSON a => FromHttpApiData (JSONQueryParam a) where
  parseQueryParam = either (Left . T.pack) (Right . JSONQueryParam) . Aeson.eitherDecodeStrict . T.encodeUtf8


-- | Servant type-level API, generated from the OpenAPI spec for Endoflife.date.
type Endoflife.dateAPI
    =    "api" :> "all.json" :> Verb 'GET 200 '[JSON] [Text] -- 'getApiAll.json' route
    :<|> "api" :> "{product}.json" :> Verb 'GET 200 '[JSON] [Cycle] -- 'getApiProduct.json' route
    :<|> "api" :> Capture "product" Text :> "{cycle}.json" :> Verb 'GET 200 '[JSON] Cycle -- 'getApiProductCycle.json' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype Endoflife.dateClientError = Endoflife.dateClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for Endoflife.date.
-- The backend can be used both for the client and the server. The client generated from the Endoflife.date OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createEndoflife.dateClient@). Alternatively, provided
-- a backend, the API can be served using @runEndoflife.dateMiddlewareServer@.
data Endoflife.dateBackend m = Endoflife.dateBackend
  { getApiAll.json :: m [Text]{- ^ Return a list of all products. Each of these can be used for the other API endpoints. -}
  , getApiProduct.json :: m [Cycle]{- ^ Get EoL dates of all cycles of a given product. -}
  , getApiProductCycle.json :: Text -> m Cycle{- ^ Gets details of a single cycle. -}
  }


newtype Endoflife.dateClient a = Endoflife.dateClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative Endoflife.dateClient where
  pure x = Endoflife.dateClient (\_ -> pure x)
  (Endoflife.dateClient f) <*> (Endoflife.dateClient x) =
    Endoflife.dateClient (\env -> f env <*> x env)

instance Monad Endoflife.dateClient where
  (Endoflife.dateClient a) >>= f =
    Endoflife.dateClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO Endoflife.dateClient where
  liftIO io = Endoflife.dateClient (\_ -> liftIO io)

createEndoflife.dateClient :: Endoflife.dateBackend Endoflife.dateClient
createEndoflife.dateClient = Endoflife.dateBackend{..}
  where
    ((coerce -> getApiAll.json) :<|>
     (coerce -> getApiProduct.json) :<|>
     (coerce -> getApiProductCycle.json) :<|>
     _) = client (Proxy :: Proxy Endoflife.dateAPI)

-- | Run requests in the Endoflife.dateClient monad.
runEndoflife.dateClient :: Config -> Endoflife.dateClient a -> ExceptT ClientError IO a
runEndoflife.dateClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runEndoflife.dateClientWithManager manager clientConfig cl

-- | Run requests in the Endoflife.dateClient monad using a custom manager.
runEndoflife.dateClientWithManager :: Manager -> Config -> Endoflife.dateClient a -> ExceptT ClientError IO a
runEndoflife.dateClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a Endoflife.dateClientError
callEndoflife.date
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> Endoflife.dateClient a -> m a
callEndoflife.date env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (Endoflife.dateClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the Endoflife.date server at the provided host and port.
runEndoflife.dateServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Endoflife.dateBackend (ExceptT ServerError IO) -> m ()
runEndoflife.dateServer config backend = runEndoflife.dateMiddlewareServer config requestMiddlewareId backend

-- | Run the Endoflife.date server at the provided host and port.
runEndoflife.dateMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> Endoflife.dateBackend (ExceptT ServerError IO) -> m ()
runEndoflife.dateMiddlewareServer Config{..} middleware backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationEndoflife.date backend

-- | Plain "Network.Wai" Application for the Endoflife.date server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationEndoflife.date :: Endoflife.dateBackend (ExceptT ServerError IO) -> Application
serverWaiApplicationEndoflife.date backend = serveWithContextT (Proxy :: Proxy Endoflife.dateAPI) context id (serverFromBackend backend)
  where
    context = serverContext
    serverFromBackend Endoflife.dateBackend{..} =
      (coerce getApiAll.json :<|>
       coerce getApiProduct.json :<|>
       coerce getApiProductCycle.json :<|>
       serveDirectoryFileServer "static")


serverContext :: Context ('[])
serverContext = EmptyContext
