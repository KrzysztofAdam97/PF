;; Zadanie 5. proszę zrealizować procecurę unique-seq, która ma następujące działanie:
;; (unique-seq [1 2 3 4 1 1 2 2 7 7 3 2 1]) => (1 2 3 4 7)
;; Innymi słowy, procedura ta utrzymuje kolejność elementów w oryginalnej sekwencji,
;; ale eliminuje duplikaty.

(defn unique-seq [mylist] (distinct mylist))

(unique-seq [1 2 3 4 1 1 2 2 7 7 3 2 1 12 5548 ])