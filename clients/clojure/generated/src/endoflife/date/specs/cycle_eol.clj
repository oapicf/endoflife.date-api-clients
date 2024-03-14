(ns endoflife/date.specs.cycle-eol
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cycle-eol-data
  {
   })

(def cycle-eol-spec
  (ds/spec
    {:name ::cycle-eol
     :spec cycle-eol-data}))
