((fn myIter [f x] (let [y (f x)] (lazy-seq (cons x (myIter f y))))) #(* 2 %) 1))
