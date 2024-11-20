(println "Define an array that contains different types of data")

(def mixed-data [
    1 
    "Hello" 
    3.14 
    true
    nil
    [1 2 3]
    {:name "John" :age 30}
    (fn [x] (* x x))
    #{"a" "b" "c"}
])


(println "Print the type of each element in the array")

(doseq [element mixed-data]
    (println (str "The type of " element " is " (type element))))