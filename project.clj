(defproject hello-world "0.1.0-SNAPSHOT"
  :description "Dummy repo for testing codescene + windows compatibility with reserved file names."
  :url "https://github.com/jumarko/windows-reserved-file-names"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot hello-world.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
