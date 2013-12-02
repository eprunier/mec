(defproject exif-reader "0.1.0-SNAPSHOT"
  :description "Image metadata reader based on metadata-extractor."
  :url "https://github.com/eprunier/mec"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.drewnoakes/metadata-extractor "2.6.2"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]]
                   :source-paths ["dev"]}})
