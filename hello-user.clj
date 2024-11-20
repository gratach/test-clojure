;; This is a simple programm in Clojure

(println "Welcome to the Clojure test")

;; Ask for the user's name and save it in the variable name

(println "What is your name? ")
(def username (read-line))

;; Print a message to the user

(println (str "Ok " username " let's learn Clojure together!"))