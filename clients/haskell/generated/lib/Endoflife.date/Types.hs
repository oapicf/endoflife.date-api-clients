{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DuplicateRecordFields      #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Endoflife.date.Types (
  Cycle (..),
  CycleCycle (..),
  CycleDiscontinued (..),
  CycleEol (..),
  CycleLts (..),
  CycleSupport (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (lookup)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
data Cycle = Cycle
  { cycleCycle :: Maybe CycleCycle -- ^ 
  , cycleReleaseDate :: Maybe Day -- ^ Release date for the first release in this cycle.
  , cycleEol :: Maybe CycleEol -- ^ 
  , cycleLatest :: Maybe Text -- ^ Latest release in this cycle.
  , cycleLink :: Maybe Text -- ^ Link to changelog for the latest release in this cycle, or null if unavailable.
  , cycleLts :: Maybe CycleLts -- ^ 
  , cycleSupport :: Maybe CycleSupport -- ^ 
  , cycleDiscontinued :: Maybe CycleDiscontinued -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Cycle where
  parseJSON = genericParseJSON optionsCycle
instance ToJSON Cycle where
  toJSON = genericToJSON optionsCycle
instance ToSchema Cycle where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsCycle

optionsCycle :: Options
optionsCycle =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
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


-- | The release cycle which this release is part of.
data CycleCycle = CycleCycle
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CycleCycle where
  parseJSON = genericParseJSON optionsCycleCycle
instance ToJSON CycleCycle where
  toJSON = genericToJSON optionsCycleCycle
instance ToSchema CycleCycle where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsCycleCycle

optionsCycleCycle :: Options
optionsCycleCycle =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ 
      ]


-- | Whether this device version is no longer in production.
data CycleDiscontinued = CycleDiscontinued
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CycleDiscontinued where
  parseJSON = genericParseJSON optionsCycleDiscontinued
instance ToJSON CycleDiscontinued where
  toJSON = genericToJSON optionsCycleDiscontinued
instance ToSchema CycleDiscontinued where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsCycleDiscontinued

optionsCycleDiscontinued :: Options
optionsCycleDiscontinued =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ 
      ]


-- | End-of-Life date for this release cycle.
data CycleEol = CycleEol
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CycleEol where
  parseJSON = genericParseJSON optionsCycleEol
instance ToJSON CycleEol where
  toJSON = genericToJSON optionsCycleEol
instance ToSchema CycleEol where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsCycleEol

optionsCycleEol :: Options
optionsCycleEol =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ 
      ]


-- | Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
data CycleLts = CycleLts
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CycleLts where
  parseJSON = genericParseJSON optionsCycleLts
instance ToJSON CycleLts where
  toJSON = genericToJSON optionsCycleLts
instance ToSchema CycleLts where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsCycleLts

optionsCycleLts :: Options
optionsCycleLts =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ 
      ]


-- | Whether this release cycle has active support.
data CycleSupport = CycleSupport
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CycleSupport where
  parseJSON = genericParseJSON optionsCycleSupport
instance ToJSON CycleSupport where
  toJSON = genericToJSON optionsCycleSupport
instance ToSchema CycleSupport where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsCycleSupport

optionsCycleSupport :: Options
optionsCycleSupport =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ 
      ]

