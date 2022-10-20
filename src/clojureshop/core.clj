(ns clojureshop.core
  (:gen-class)
  (:require [repl.core :as core]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (core/do-repl)
)
