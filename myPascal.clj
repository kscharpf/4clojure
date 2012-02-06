((fn myPascal-row [row]
    (map (fn myPascal-cell
        ([col]
           (if (= col 0)
               1
           (* (myPascal-cell (dec col)) (/ (- row col) col))))) (range 0 row))
  ) 11)   
