((fn capsOnly 
    ([x y] 
        (if (empty? x)
            (apply str y)
            (if 
                 (and 
                     (>= (int (first x)) (int \A))
                     (<= (int (first x)) (int \Z)))
                 (capsOnly (rest x) (concat y [(first x)]))
                 (capsOnly (rest x) y))))
    ([x]
        (capsOnly x []))) "HeLlO, WoRlD!")
