((fn myInterpose
    ([x y z]
        (if (empty? y)
            z
        (if (empty? (rest y))
            (conj z (first y))
        (myInterpose x (rest y) (conj (conj z (first y)) x)))))
    ([x y] (myInterpose x y []))) 0 [1 2 3])
