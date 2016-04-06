(ns {{name}}.core-test
  (:require [cljs.test     :refer-macros [is]]
            [devcards.core :refer-macros [defcard-rg deftest]]
            [{{name}}.core :as core]
            [reagent.core  :as r]))

(deftest fixme
  (is (= 0 1)))

(defcard-rg sample-component
  [core/sample-component])
