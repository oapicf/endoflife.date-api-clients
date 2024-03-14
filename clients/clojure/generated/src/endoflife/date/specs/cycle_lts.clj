(ns endoflife/date.specs.cycle-lts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cycle-lts-data
  {
   })

(def cycle-lts-spec
  (ds/spec
    {:name ::cycle-lts
     :spec cycle-lts-data}))
