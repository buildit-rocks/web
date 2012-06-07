(ns web.server
  (:require [noir.server :as server]
            [web.views.common]
            [web.views.welcome]))

(server/load-views "src/web/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'web})))

;; the handler for rinf and the war file
(def handler
  (server/gen-handler {:mode :prod
                       :ns 'web}))
