((fn myRange 
    ([x y z] 
        (if (= x y)
            z
        (myRange (inc x) y (concat z [x]))))
    ([x y] (myRange x y [])))
