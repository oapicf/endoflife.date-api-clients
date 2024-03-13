(ns endoflife/date.specs.cycle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [endoflife/date.specs.cycle-cycle :refer :all]
            [endoflife/date.specs.cycle-eol :refer :all]
            [endoflife/date.specs.cycle-lts :refer :all]
            [endoflife/date.specs.cycle-support :refer :all]
            [endoflife/date.specs.cycle-discontinued :refer :all]
            )
  (:import (java.io File)))


(def cycle-data
  {
   (ds/opt :cycle) cycle-cycle-spec
   (ds/opt :releaseDate) inst?
   (ds/opt :eol) cycle-eol-spec
   (ds/opt :latest) string?
   (ds/opt :link) string?
   (ds/opt :lts) cycle-lts-spec
   (ds/opt :support) cycle-support-spec
   (ds/opt :discontinued) cycle-discontinued-spec
   })

(def cycle-spec
  (ds/spec
    {:name ::cycle
     :spec cycle-data}))
