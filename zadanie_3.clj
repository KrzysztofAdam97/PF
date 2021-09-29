;; Zadanie 3. Proszę zrealizować procedurę liczącą pierwiastek sześcienny podanej liczby x.
;;            Hint: SICP Exercise 1.8

(def x 27)

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn cube
  [x]
  (* x x x))

(defn square
  [x]
  (* x x))

(defn improve
  [G x]
  (/ (+ (/ x (square G))
        (* 2 G))
     3)
  )

(defn good-enough?
  [G x]
  (< (abs (- (cube G) x)) 0.0001)
  )

(defn cube-iter
  [G x]
  (if (good-enough? G x)
    G
    (cube-iter (improve G x) x))
  )

(defn cube-root
  [x]
  (cube-iter 1.0 x)
  )

(print (cube-root x))
