((fn myRotate 
  ([nextIdx lastIdx x y]
    (if (= nextIdx lastIdx)
      (concat y [(nth x nextIdx)])
    (myRotate 
        (mod (inc nextIdx) (count x)) 
        lastIdx 
        x 
        (concat y [(nth x nextIdx)]))))
  ([n x]
    (let [y (count x)]
      (if (< n 0)
        (myRotate (+ n y) x)
      (if (> n y)
        (myRotate (- n y) x)
      (myRotate 
         n
         (mod (- (+ n y) 1) y) 
         x [])))
      ))) 2 [1 2 3 4 5])
