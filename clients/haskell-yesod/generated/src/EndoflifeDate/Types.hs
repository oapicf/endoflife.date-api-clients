{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module EndoflifeDate.Types (
  Cycle (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
data Cycle = Cycle
  { cycleCycle :: Maybe Value -- ^ Release Cycle
  , cycleReleaseDate :: Maybe Value -- ^ Release Date for the first release in this cycle
  , cycleEol :: Maybe Value -- ^ End of Life Date for this release cycle
  , cycleLatest :: Maybe Value -- ^ Latest release in this cycle
  , cycleLink :: Maybe Value -- ^ Link to changelog for the latest release, if available
  , cycleLts :: Maybe Value -- ^ Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
  , cycleSupport :: Maybe Value -- ^ Whether this release cycle has active support
  , cycleDiscontinued :: Maybe Value -- ^ Whether this cycle is now discontinued.
  } deriving (Show, Eq, Generic)

instance FromJSON Cycle where
  parseJSON = genericParseJSON optionsCycle
instance ToJSON Cycle where
  toJSON = genericToJSON optionsCycle

optionsCycle :: Options
optionsCycle =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("cycleCycle", "cycle")
      , ("cycleReleaseDate", "releaseDate")
      , ("cycleEol", "eol")
      , ("cycleLatest", "latest")
      , ("cycleLink", "link")
      , ("cycleLts", "lts")
      , ("cycleSupport", "support")
      , ("cycleDiscontinued", "discontinued")
      ]

