(ns endoflife/date.api.default
  (:require [endoflife/date.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [endoflife/date.specs.cycle :refer :all]
            )
  (:import (java.io File)))


(defn-spec get-api-all-json-with-http-info any?
  "All Products
  Return a list of all products. Each of these can be used for the other API endpoints."
  []
  (call-api "/api/all.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-api-all-json any-type-spec
  "All Products
  Return a list of all products. Each of these can be used for the other API endpoints."
  []
  (let [res (:data (get-api-all-json-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode any-type-spec res st/string-transformer)
       res)))


(defn-spec get-api-product-cycle-json-with-http-info any?
  "Single cycle details
  Gets details of a single cycle"
  [product any-type-spec, cycle any-type-spec]
  (check-required-params product cycle)
  (call-api "/api/{product}/{cycle}.json" :get
            {:path-params   {"product" product "cycle" cycle }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-api-product-cycle-json cycle-spec
  "Single cycle details
  Gets details of a single cycle"
  [product any-type-spec, cycle any-type-spec]
  (let [res (:data (get-api-product-cycle-json-with-http-info product cycle))]
    (if (:decode-models *api-context*)
       (st/decode cycle-spec res st/string-transformer)
       res)))


(defn-spec get-api-product-json-with-http-info any?
  "Get All Details
  Get EoL dates of all cycles of a given product."
  [product any-type-spec]
  (check-required-params product)
  (call-api "/api/{product}.json" :get
            {:path-params   {"product" product }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-api-product-json any-type-spec
  "Get All Details
  Get EoL dates of all cycles of a given product."
  [product any-type-spec]
  (let [res (:data (get-api-product-json-with-http-info product))]
    (if (:decode-models *api-context*)
       (st/decode any-type-spec res st/string-transformer)
       res)))


