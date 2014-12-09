(ns console.core (:gen-class))
(use 'clojure.java.io)
(use '[clojure.string :only (split)])

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "ffff !!!!!"))


(defn read-file [] 
	(with-open [rdr (reader "resources/data.txt")]
		(doseq [line (line-seq rdr)]
			
			(split line #",")
		)
	)
)

;(defn find-by-id)

;(defn find-by-name)

(defn -main [& args]
	(read-file)
)
