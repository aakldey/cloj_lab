(ns console.core (:gen-class))
(use 'clojure.java.io)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "ffff !!!!!"))


(defn read-file [] 
	(with-open [rdr (reader "resources/data.txt")]
		(doseq [line (line-seq rdr)]
			(println line)
		)
	)
)

(defn -main [& args]
	(read-file)
)
