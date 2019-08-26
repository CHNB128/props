(ns props.core-test
  (:require [clojure.test :refer :all]
            [props.core :refer :all]))

(deftest a-test
  (testing "Succesfully get props test.value"
    (is (= (prop "test.value") "Red-Hot-Chili-Peppers"))))

(deftest b-test
  (testing "Get default value of props"
    (is (= (prop "unknown.value" "default") "default"))))

(deftest c-test
  (testing "Get error for value without default state"
    (try (prop "unknown.value")
         (catch Exception e (is true)))))