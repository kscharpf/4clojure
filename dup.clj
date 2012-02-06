((fn myDup 
    ([x y] 
        (if
            (empty? x)
                y
            (myDup (rest x) (concat y [(first x) (first x)]))))
    ([x] (myDup x []))) [:a :a :b :b])
