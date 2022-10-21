(ns repl.core)

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

(defn truthy []
  (println (if nil "True" "False"))
  (println (if 0 "True" "False")))

(defn andf []
  (println (and "Hello" "Then" "Goodbye")))

(defn orf []
  (println (or "Hello" "Then" "Goodbye")))

(defn equ []
  (println (= false nil))
  (println (= "hello" "hello" (clojure.string/reverse "olleh"))))

;; ----------------------------------------------------------------

(defn do-repl []
  (calc 3)
  (meditate "hello" true)
  (println (str "squre 4 * 4 = " (squ 4)))
  (truthy)
  (orf)
  (andf)
  (equ))
