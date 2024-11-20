(println "This is a function that says hello to the name given as an argument")

(defn hello-user [name]
  (str "Hello " name "!"))

(println (hello-user "John"))


(println "This is a function that states that the first user greets the second user")

(defn greet-user [user1 user2]
  (str user1 " greets " user2))

(println (greet-user "John" "Jane"))


(println "This is a function that takes a function with two arguments as imput and applies two arguments in both possible orders")

(defn apply-twice [f a b]
  (str (f a b) " and " (f b a)))

(println (apply-twice greet-user "John" "Jane"))