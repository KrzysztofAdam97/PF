
(defn middle-unique-seq [mylist]
        (sort mylist)
)

(defn unique-seq [mylist]
        (dedupe (middle-unique-seq mylist))
)

(print (unique-seq [1 10 4 34 34 2 3 4 1 1 1 1 1 1 2 2 7 7 3 2 1 12 12 12 5548 ]))



(defn middle-unique-seq [mylist]
        (distinct mylist)
)

(defn unique-seq [mylist]
        (sort (middle-unique-seq mylist))
)

(print (unique-seq [1 10 4 34 34 2 3 4 1 1 1 1 1 1 2 2 7 7 3 2 1 12 12 12 5548 ]))