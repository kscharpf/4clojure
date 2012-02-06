((fn fib-iter 
       ([curList a b curCount]
              (if (= curCount 0)
                  curList 
                  (fib-iter (concat curList [a]) (+ a b) a (- curCount 1))))
       ([n] (fib-iter [] 1 0 n))) 5)
