(ns repl.datatype)

;; String
;; Strings are sequences of characters representing text.

(def person-name "zTgx")
(defn get-person-info []
  (println person-name))

(def silly-strings "I am immutable. I am a silly strings.")
(defn replace-silly-strings [s, d]
  (println s)
  (println d)
  (clojure.string/replace silly-strings s d))

(defn get-first-silly-strings []
  (println (first silly-strings)))

;; encode utils
(defn encode-letter
  [s x]
  (let [code (Math/pow (+ x (int (first (char-array s)))) 2)]
    (str "#" (int code))))
(defn encode 
  [s]
  (let [number-of-words (count (clojure.string/split s #" "))]
    (clojure.string/replace s #"\w" (fn [s] (encode-letter s number-of-words)))))

;; decode
(defn decode-letter
  [x y]
  (let [number (Integer/parseInt (subs x 1))
        letter (char (- (Math/sqrt number) y))]
    (str letter)))
(defn decode [s]
  (let [number-of-words (count (clojure.string/split s #" "))]
    (clojure.string/replace s #"\#\d+" (fn [s] (decode-letter s number-of-words)))))