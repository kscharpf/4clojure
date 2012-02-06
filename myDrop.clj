((fn myDrop 
    ([x n y c]
        (if (empty? x)
            y
        (if (= (mod c n) 0)
            (myDrop (rest x) n y (inc c))
        (myDrop (rest x) n (conj y (first x)) (inc c)))))
    ([x n] (myDrop x n [] 1))) [1 2 3 4 5 6 7 8] 3)
