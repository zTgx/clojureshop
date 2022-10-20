(ns repl.core
)

(defn calc [x]
  (println (* x x)))

(defn meditate [s calm]
  (println "Clojure Meditate v1.0")
  (if calm
  (println (clojure.string/capitalize s))
  (println (str (clojure.string/upper-case s) "!"))))

(defn squ
  "Returns the product of the number `x` with itself"
  [x]
  (* x x))
;; ----------------------------------------------------------------

(defn do-repl []
  (calc 3)
  (meditate "hello" true)
  (println (str "squre 4 * 4 = " (squ 4))))
