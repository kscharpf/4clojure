((fn myPack 
    ([x y] 
        (let [z (take-while (fn [v] (= (first x) v)) x)]
            (if (empty? x)
                y
            (myPack (drop (count z) x) (concat y [z])))))
    ([x] (myPack x []))) [1 1 2 1 1 1 3 3])
