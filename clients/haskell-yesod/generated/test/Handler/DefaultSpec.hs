{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getApiAllJsonR" $
        it "returns 501 Not Implemented" $ do
            get ApiAllJsonR
            statusIs 501

    describe "getApi{Product}JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ Api{Product}JsonR unknown
            statusIs 501

    describe "getApiByValue{Cycle}JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiByValue{Cycle}JsonR unknown unknown
            statusIs 501
