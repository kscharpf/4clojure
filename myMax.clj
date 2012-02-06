((fn myMax 
    ([x y] 
        (if (> x y) x y)) 
    ([x y & z] 
        (if (> (myMax x y) (last (sort z))) (myMax x y) (last (sort z))))) 1 2 3 2 7 5)
