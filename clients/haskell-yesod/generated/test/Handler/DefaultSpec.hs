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
            get $ Api{Product}JsonR "product_example"
            statusIs 501

    describe "getApiByText{Cycle}JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ ApiByText{Cycle}JsonR "product_example" "cycle_example"
            statusIs 501
