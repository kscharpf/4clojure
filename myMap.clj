((fn myMap
    ([f x y]
        (if (empty? x)
            (lazy-seq y)
        (recur f (rest x) (lazy-cat y [(f (first x))]))))
    ([f x] (myMap f x []))) inc [2 3 4 5 6])

(= [1e6 (inc 1e6)] 
  (->> 
    (
     (fn myMap 
        ([f xs ys]
            (let [lf (fn [g x y]
                (if (empty? x)
                    y
                (recur g 
                       (rest x) 
                       (conj 
                           y
                           (g (first x)))
                 )))]
            (lazy-seq (lf f xs ys))))
        ([f xs] (myMap f xs []))) inc (range)) (drop (dec 1e6)) (take 2)))
      
(comment          
      (loop [fun f xs x ys []]
          (if (empty? xs)
              (lazy-seq ys)
          (recur fun (rest xs) (lazy-cat ys [(f (first xs))])))
       )) inc (range)) (drop (dec 1e6)) (take 2))) 
)
