((fn myRepl 
    ([x y z]
        (if (empty? x)
            z
        (myRepl (rest x) y 
            (concat z ((fn myRep-Char [x y z] 
                (if (= y 0)
                    z
                (myRep-Char x (- y 1) (conj z x)))) (first x) y [])))))
    ([x y] (myRepl x y []))) [:a :b] 4)
