((fn myFlat-list
    ([x y]
        (if (empty? x)
            y 
        (myFlat-list (rest x) 
            (concat y 
                ((fn myFlat-entry [x]
                    (if (coll? x)
                        (concat 
                            (myFlat-entry (first x))
                            (myFlat-list (rest x) []))
                    [x])) (first x))
            )))
    )
    ([x] (myFlat-list x []))) '((1 2) 3 [4 [5 6]]))
