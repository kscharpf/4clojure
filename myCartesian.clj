((fn cartesian 
    ([x y z]
        (if (empty? x)
            (set z)
        (cartesian (rest x) y (concat z (map #(list (first x) %) y)))))
    ([x y] (cartesian x y []))) #{1 2 3} #{4 5}) 
    
