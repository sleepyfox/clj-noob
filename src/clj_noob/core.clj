(ns clj-noob.core
  (:gen-class))

(defn fib "Generate a fibonacci number" [n]
  (if (< n 2)
    n
    (+ (fib (- n 1))
       (fib (- n 2)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, Brave New World!"))
