((fn myGroupBy 
    ([f x z]
        (let [y (first x)]
            (if (empty? x)
                z
            (if (contains? z (f y))
                (myGroupBy f (rest x) 
                    (assoc z (f y) 
                        (concat (get z (f y)) [y])))
            (myGroupBy f (rest x) (assoc z (f y) [y]))))))
    ([f x] (myGroupBy f x (hash-map))))
     #(> % 5) #{1 3 6 8})
            
