(defproject org.clojars.hms/karras "0.6.0"
  :description "A clojure entity framework for MongoDB"
  :dependencies [[org.clojure/clojure "1.3.0-alpha4"]
                 [org.clojure.contrib/def "1.3.0-alpha4"]
                 [org.mongodb/mongo-java-driver "2.4"]
		 [org.clojars.hms/inflections "0.4.2-SNAPSHOT"]]  
  :dev-dependencies [[swank-clojure "1.3.0-SNAPSHOT"]
                     [lein-clojars "0.5.0"]
                     [autodoc "0.7.1" :exclusions [org.clojure/clojure
                                                  org.clojure/clojure-contrib]]
                     [scriptjure "0.1.9" :exclusions [org.clojure/clojure
                                                      org.clojure/clojure-contrib]]
                     [midje "1.0.1"]]
  :aot [karras.core karras.collection karras.sugar karras.entity]
  :autodoc {:web-src-dir "http://github.com/wilkes/karras/blob/"
            :web-home "http://wilkes.github.com/karras"})
