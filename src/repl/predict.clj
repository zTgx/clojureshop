(ns repl.predict)

;; Predicting the Atmospheric Carbon Dioxide Level
;; Estimate = 382 + ((Year - 2006) * 2).
(def base-co2 382)
(def base-year 2006)

(defn co2-estimate [year]
  "Predicting the Atmospheric Carbon Dioxide Level"
  (+ base-co2 (* 2 (- year base-year))))