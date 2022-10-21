(ns core.core-test
  (:require [clojure.test :refer :all]
            [repl.datatype :refer :all]))

;; (deftest d-test
;;   (testing "truefalse")
;;   (false? nil))

;; (deftest d1-test
;;   (testing "d1-test...")
;;   (get-person-info)
;;   (println silly-strings)
;;   (def new-strings (replace-silly-strings "silly" "good"))
;;   (println new-strings))

;; (deftest d2-test
;;   (testing "d2")
;;   (get-first-silly-strings))

(deftest d3-test
  (testing "d3")
  (is (= (encode "Hello World") "#5476#10609#12100#12100#12769 #7921#12769#13456#12100#10404"))
  (is (= (decode "#5476#10609#12100#12100#12769 #7921#12769#13456#12100#10404") "Hello World")))
