(defproject web "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :plugins [[lein-ring "0.6.7"]]
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir "1.2.1"]
                           [congomongo "0.1.9"]]
            :main web.server
            :ring {:handler web.server/handler})

