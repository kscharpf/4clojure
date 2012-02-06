((fn cardStrings [xs]
  (
    let [x1 (first xs) x2 (second xs)]
    ( 
    fn cardStrToMap [suitChr rankChr suitMap rankMap]
      (hash-map :suit (get suitMap suitChr), 
                :rank (get rankMap rankChr))
      x1 x2 (hash-map \D :diamond, \H :heart, \S :spade, \C :club) 
            (hash-map \2 0, \3 1, \4 2, \5 3, \6 4, \7 5, \8 6,
                      \9 7, \T 8, \J 9, \Q 10, \K 11, \A 12)))) "DQ")
 
