( ((defn myCompose
    [& x]
        (if (= (count x) 1)
            (first x)
        ((first x) 
         (myCompose (rest x)))))
     rest reverse)
   [1 2 3 4])

