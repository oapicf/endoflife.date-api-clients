(ns endoflife/date.specs.cycle-cycle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cycle-cycle-data
  {
   })

(def cycle-cycle-spec
  (ds/spec
    {:name ::cycle-cycle
     :spec cycle-cycle-data}))
