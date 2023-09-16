(ns endoflife/date.specs.cycle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [endoflife/date.specs. :refer :all]
            [endoflife/date.specs. :refer :all]
            [endoflife/date.specs. :refer :all]
            [endoflife/date.specs. :refer :all]
            [endoflife/date.specs. :refer :all]
            [endoflife/date.specs. :refer :all]
            [endoflife/date.specs. :refer :all]
            [endoflife/date.specs. :refer :all]
            )
  (:import (java.io File)))


(def cycle-data
  {
   (ds/opt :cycle) any-type-spec
   (ds/opt :releaseDate) any-type-spec
   (ds/opt :eol) any-type-spec
   (ds/opt :latest) any-type-spec
   (ds/opt :link) any-type-spec
   (ds/opt :lts) any-type-spec
   (ds/opt :support) any-type-spec
   (ds/opt :discontinued) any-type-spec
   })

(def cycle-spec
  (ds/spec
    {:name ::cycle
     :spec cycle-data}))
