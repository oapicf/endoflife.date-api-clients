{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module EndoflifeDate.Types (
  Cycle (..),
  CycleCycle (..),
  CycleDiscontinued (..),
  CycleEol (..),
  CycleLts (..),
  CycleSupport (..),
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
  { cycleCycle :: Maybe CycleCycle -- ^ 
  , cycleReleaseDate :: Maybe Day -- ^ Release date for the first release in this cycle.
  , cycleEol :: Maybe CycleEol -- ^ 
  , cycleLatest :: Maybe Text -- ^ Latest release in this cycle.
  , cycleLink :: Maybe Text -- ^ Link to changelog for the latest release in this cycle, or null if unavailable.
  , cycleLts :: Maybe CycleLts -- ^ 
  , cycleSupport :: Maybe CycleSupport -- ^ 
  , cycleDiscontinued :: Maybe CycleDiscontinued -- ^ 
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


-- | The release cycle which this release is part of.
data CycleCycle = CycleCycle
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CycleCycle where
  parseJSON = genericParseJSON optionsCycleCycle
instance ToJSON CycleCycle where
  toJSON = genericToJSON optionsCycleCycle

optionsCycleCycle :: Options
optionsCycleCycle =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Whether this device version is no longer in production.
data CycleDiscontinued = CycleDiscontinued
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CycleDiscontinued where
  parseJSON = genericParseJSON optionsCycleDiscontinued
instance ToJSON CycleDiscontinued where
  toJSON = genericToJSON optionsCycleDiscontinued

optionsCycleDiscontinued :: Options
optionsCycleDiscontinued =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | End-of-Life date for this release cycle.
data CycleEol = CycleEol
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CycleEol where
  parseJSON = genericParseJSON optionsCycleEol
instance ToJSON CycleEol where
  toJSON = genericToJSON optionsCycleEol

optionsCycleEol :: Options
optionsCycleEol =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
data CycleLts = CycleLts
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CycleLts where
  parseJSON = genericParseJSON optionsCycleLts
instance ToJSON CycleLts where
  toJSON = genericToJSON optionsCycleLts

optionsCycleLts :: Options
optionsCycleLts =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Whether this release cycle has active support.
data CycleSupport = CycleSupport
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CycleSupport where
  parseJSON = genericParseJSON optionsCycleSupport
instance ToJSON CycleSupport where
  toJSON = genericToJSON optionsCycleSupport

optionsCycleSupport :: Options
optionsCycleSupport =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]

