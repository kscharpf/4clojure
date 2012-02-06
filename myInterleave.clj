((fn myInterleave 
    ([x y z]
        (if (or (empty? x) (empty? y))
            z
        (myInterleave (rest x) (rest y) (conj (conj z (first x)) (first y)))))
    ([x y] (myInterleave x y []))) [1 2 3] [:a :b :c])
