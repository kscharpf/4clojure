((fn gcd [x y]
    (if (= y 0)
        x
    (gcd y (mod x y)))) 5 7)
