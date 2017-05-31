(ns hello-world.core
  (:gen-class))

(defn fun [a b]
  (println "I'm feeling good today")
  (+ a b))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (fun [10 20]))

