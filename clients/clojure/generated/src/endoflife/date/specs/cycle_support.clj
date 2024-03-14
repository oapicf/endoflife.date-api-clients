(ns endoflife/date.specs.cycle-support
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cycle-support-data
  {
   })

(def cycle-support-spec
  (ds/spec
    {:name ::cycle-support
     :spec cycle-support-data}))
