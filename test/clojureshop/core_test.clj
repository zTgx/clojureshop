(ns clojureshop.core-test
  (:require [clojure.test :refer :all]
            [clojureshop.core :refer :all]
            [repl.predict :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (co2-estimate 2050) 470))))

(deftest p-test
  (testing "predict"
  (is (= (co2-estimate 2006) 382))))

(deftest p1-test
  (testing "predict"
  (is (= (co2-estimate 2020) 410))))

(deftest p2-test
  (testing "predict"
  (is (= (co2-estimate 2050) 470))))

(deftest p3-test
  (testing "truefalse")
  (is (= (if 0 "True" "False") "True")))

(deftest p4-test
  (testing "truefalse")
  (true? 1))

(deftest p4-test
  (testing "truefalse")
  (false? nil))