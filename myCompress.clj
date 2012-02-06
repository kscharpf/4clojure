((fn myCompress
    ([x y]
        (if (empty? x)
            y
        (if (= (first x) (second x))
            (myCompress (rest x) y)
        (myCompress (rest x) (conj y (first x))))))
    ([x] (myCompress x []))) "Leeeerroyyy")
