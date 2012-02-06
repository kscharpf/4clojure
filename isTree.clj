((fn isTree [x]
    (if (coll? x)
        (if (= (count x) 3)
            (and (isTree (nth x 1)) (isTree (nth x 2)))
        false)
    (if (nil? x)
        true
    false) )) '(:a (:b nil nil)))
