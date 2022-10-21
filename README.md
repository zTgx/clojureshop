# clojureshop

### REPL Basic

* `nil` is the Clojure equivalent of "null," or "nothing".
* `print` (without a new line)
* `println` (with a new line)
* Exit the REPL by pressing Ctrl + D
* `(System/exit 0)`
* navigate the history: Ctrl + P (or the UP arrow) and Ctrl + N (or the DOWN arrow).
* Search: press Ctrl + R
* `*1 is a special variable that is bound to the result of the last expression that was
  evaluated in the REPL.`
* press Ctrl + L to clear the screen
* *e should contain details about the exception
* (doc str)
* `(apropos "case")`
* `Creating a literal list is done by adding a quotation '`
* "Code is data"
* def -> global var
* let -> local var
* `(let [x 10 y 20])`
* `(def sq (fn [x] (* x x)))`
* defn is combine def and fn
* false and nil are the only values that are treated as falsey in Clojure; everything else is
truthy.
* and returns the first falsey value that it encounters (from left to right) and will
not evaluate the rest of the expression when that is the case. When all the values
passed to and are truthy, and will return the last value.
* or works in a similar fashion: it will return the first truthy value that it comes across and it will not evaluate the rest of the expression when that is the case.
* = function can also take one argument, in which case it will always return true.

### Date Types
* first returns the first element of a collection.
* `(last "a collection of 1 character strings")`
* ```clojure (type 10000000000000000000) clojure.lang.BigInt```
* Math/PI - random - sqrt - round
* `(int \a)` -> convert a character to a number.
* `(first (char-array "abcd"))` -> convert string to char
* 