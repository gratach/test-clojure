(println "This defines a variable cities as a list of strings")

(def cities '("Berlin" "Paris" "London" "New York" "Tokyo"))


(println "Print 'I am not living in ...' for each city in the list")

(doseq [city cities]
  (println (str "I am not living in " city)))


(println "Define a new list that contains all cities from the original list plus Hamburg")

(def more-cities (conj cities "Hamburg"))


(println "Print 'I am living in ...' for all elements that are in the new list but not in the original list")

(doseq [city more-cities]
  (when (not (loop [index 0 found false]
          (if (= index (count cities))
            found
            (recur (inc index) (or found (= city (nth cities index)))))))
    (println (str "I am living in " city))))


(println "Create an array with the lengths of the city names and print it")

(def city-lengths (map count cities))
(println city-lengths)