(ns multifile.multifilemain
  (:require [multifile.dependencyone :refer [dependencyfunctionone]]
            [multifile.dependencytwo :refer [dependencyfunctiontwo]]))

(defn -main []
  (let [result-one (dependencyfunctionone)
        result-two (dependencyfunctiontwo)]
    (println result-one)
    (println result-two)))

(-main)
