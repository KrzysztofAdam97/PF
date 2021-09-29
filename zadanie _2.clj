;; Zadanie 2. Proszę uzależnić ilość kroków wykonywanych przez procedurę heron-sqrt
;;            od pewnego parametru (n - liczby całkowitej) oznaczającego tę ilość.

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn square
  [x]
  (* x x))

(defn good-enough?
  [G x]
  (<= (abs (- x (square G))) 0.00000001))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [G x]
  (avg G (/ x G)))

(defn heron-sqrt
  [G x maxIter]
  (println "G is" G)
  (if (<= maxIter 1)
    G
    (if (good-enough? G x)
      G

      ;; otherwise,
      (heron-sqrt (improve G x) x (dec maxIter)))))
  
  (heron-sqrt 1 2 5)