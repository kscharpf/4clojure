((fn buildColl [x]
    (count ((fn myFilter [k l] 
        (if (empty? k)
            l
        (if (> (first k) (nth k 1))
            (myFilter (drop 2 k) (concat l [(nth k 1)] ))
        (myFilter (drop 2 k) l))))
    (interleave (map (fn [h] (reduce (fn [a b] (+ a b)) h)) 
       (map 
           (fn [z] ( 
                 map (
                     fn [c] (let [g (- (int c) 48)] 
                               (* g g))) z))  
               (map (fn [d] (str d)) x))) x) []))) [22 23 24 25])
