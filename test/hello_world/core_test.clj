(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all]))

(deftest a-test
  (testing "fun test"
    (is (= 30 (fun 10 20)))))
