((fn myDiff
    ([x y z]
        (if (empty? x)
            (if (empty? y)
                (set z)
            (set (concat z y)))
        (if (contains? y (first x))
            (myDiff (rest x) (disj y (first x)) z)
        (myDiff (rest x) y (concat z [(first x)])))))
    ([x y] (myDiff x y #{}))) #{1 2 3 4 5 6} #{1 3 5 7})

(defn -main  
    (println (myDiff #{1 2 3 4 5 6} #{1 3 5 7})))
