((fn mySymDiff 
     ([x y z] 
         (if (or (empty? x) (empty? y))
             z
         (myIntersection (disj x (first x))
                         y 
                         (if (contains? y (first x))
                             (conj z (first x))
                         z))))
    ([x y] (myIntersection x y #{}))) #{0 1 2 3} #{2 3 4 5})
