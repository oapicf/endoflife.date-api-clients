{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import Endoflife.date.Model
import Endoflife.date.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy Cycle)
      propMimeEq MimeJSON (Proxy :: Proxy CycleCycle)
      propMimeEq MimeJSON (Proxy :: Proxy CycleDiscontinued)
      propMimeEq MimeJSON (Proxy :: Proxy CycleEol)
      propMimeEq MimeJSON (Proxy :: Proxy CycleLts)
      propMimeEq MimeJSON (Proxy :: Proxy CycleSupport)
      
