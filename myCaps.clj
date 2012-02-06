((fn capsOnly 
    [ x ] 
        (if (empty? x)
            []
            (concat 
                (if 
                     (and 
                         (>= (int (first x)) (int \A))
                         (<= (int (first x)) (int \Z)))
                     [(first x)] 
                     []) 
                (capsOnly (rest x))))) (fn doCaps [x] (apply str (capsOnly x)) "HeLlO, WoRlD!")

