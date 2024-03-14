(ns endoflife/date.specs.cycle-discontinued
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cycle-discontinued-data
  {
   })

(def cycle-discontinued-spec
  (ds/spec
    {:name ::cycle-discontinued
     :spec cycle-discontinued-data}))
