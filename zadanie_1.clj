;; Zadanie 1. Proszę uzależnić ilość kroków wykonywanych przez procedurę heron-sqrt
;;            od pewnego parametru tej procedury określającego dokładność
;;            (zamiast stałej 0.00000001).

(defn abs [x]
(if (< x 0) (- x) x))

(defn square [x] (* x x))

(defn good-enough? [G x par] (<= (abs (- x (square G))) par ))

(defn avg [x y] (/ (+ x y) 2))

(defn improve [G x] (avg G (/ x G)))

(defn heron-sqrt
[G x par]
(println "G is" G)
(if (good-enough? G x par)
G

;; otherwise,
(heron-sqrt (improve G x) x par)))



(heron-sqrt 1 2 0.00000000000001)