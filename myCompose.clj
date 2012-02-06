( ((defn myCompose 
    ([& x] 
        (let [y (first x)]
            (if (= (count x) 1)
                (fn [x] y) 
            (fn [g] (
                y 
                (myCompose (rest x))))
        ))) 
    rest reverse) 
  [1 2 3 4]) 
