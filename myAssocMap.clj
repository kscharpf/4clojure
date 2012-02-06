((fn myMap 
    ([x y z]
        (if (or (empty? x) (empty? y))
            z
        (myMap (rest x) (rest y) (assoc z (first x) (first y)))))
    ([x y] (myMap x y {}))) [:a :b :c] [1 2 3])
