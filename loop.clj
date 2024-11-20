(println "I am now gonna print 'hello world' 5 times")

;; This loop command defines a variable i with the initial value 0
(loop [i 0]
  ;; The when command is a conditional statement that will only execute the code inside the brackets if the condition is true
  (when (< i 5)
    (println "hello world (Nr." (inc i) ")")
    ;; The recur command will increment the variable i by 1 and call the loop command again
    (recur (inc i))))

(println "I am now gonna print a triangle made of 0 and 1")
(loop [x 0 y 0]
    (print (if (< y x) "1" "0"))
    (if (< x 10)
        (recur (inc x) y)
        (if (< y 10)
            (do
                (println "")
                (recur 0 (inc y)))
                (println ""))))

