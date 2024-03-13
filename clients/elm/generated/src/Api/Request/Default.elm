{-
   endoflife.date
   Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

   The version of the OpenAPI document: 0.0.1
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Default exposing
    ( getApiAllJson
    , getApiProductCycleJson
    , getApiProductJson
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Return a list of all products. Each of these can be used for the other API endpoints.
-}
getApiAllJson : Api.Request (List String)
getApiAllJson =
    Api.request
        "GET"
        "/api/all.json"
        []
        []
        []
        Nothing
        (Json.Decode.list Json.Decode.string)


{-| Gets details of a single cycle
-}
getApiProductCycleJson : String -> String -> Api.Request Api.Data.Cycle
getApiProductCycleJson product_path cycle_path =
    Api.request
        "GET"
        "/api/{product}/{cycle}.json"
        [ ( "product", identity product_path ), ( "cycle", identity cycle_path ) ]
        []
        []
        Nothing
        Api.Data.cycleDecoder


{-| Get EoL dates of all cycles of a given product.
-}
getApiProductJson : String -> Api.Request (List Api.Data.Cycle)
getApiProductJson product_path =
    Api.request
        "GET"
        "/api/{product}.json"
        [ ( "product", identity product_path ) ]
        []
        []
        Nothing
        (Json.Decode.list Api.Data.cycleDecoder)

