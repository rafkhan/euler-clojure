(defn fib [a b sum] 
  (if (> 4000000 b)
    (if (even? b)
      (fib b (+ a b) (+ sum b))
      (fib b (+ a b) sum))
    (println sum)))

(fib 0 1 0)
