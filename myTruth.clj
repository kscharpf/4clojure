((fn myTruth [ & x ] 
    ((fn myTruth-inner
        [a b c]
            (if (empty? a)
                (if (and b c)
                    true
                false)
            (myTruth-inner (rest a) (or b (= true (first a))) (or c (= false (first a)))))) x false false)) false false true)   
