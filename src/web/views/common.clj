(ns web.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "web"]
               [:meta  {:name "viewport"
                        :content "width=device-width, initial-scale=1.0"}]
               [:link {:rel "shortcut icon"
                       :href "favicon.ico"}]
               ;;CSS files
               (include-css "/css/reset.css")
               (include-css "/css/bootstrap.css")
               (include-css "/css/bootstrap-responsive.css")

               ;;JS files
               (include-js "/js/jquery-1.7.2.min.js")
               (include-js "/js/backbone-min.js")
               (include-js "/js/underscore-min.js")
               (include-js "/js/bootstrap.js")
               ]
              [:body {:data-spy "scroll"
                      :data-target ".subnav"
                      :data-offset "50"}

               [:div.container
                  content]]))
