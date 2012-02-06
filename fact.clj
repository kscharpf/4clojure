((fn myFact 
    ([x y] 
        (if (= x 1)
            y
        (myFact (dec x) (* x y))))
    ([x] (myFact x 1))) 1)
        
