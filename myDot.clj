((fn myDot 
    ([x y z]
        (if (empty? x)
            z
        (myDot (rest x) (rest y) (+ z (* (first x) (first y))))))
    ([x y] (myDot x y 0))) [1 1 1] [1 1 1])
