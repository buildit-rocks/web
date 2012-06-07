(ns web.views.welcome
  (:require [web.views.common :as common]
            [web.views.welcome])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]
        [hiccup.page-helpers :only [link-to, image]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to web.  Editing it"]))

(defpage "/" []
    (common/layout
      [:section#main
        [:div.page-header
            [:h1 "BuildIt hackathon"
              [:small "backend waits content"]]]
        ;;content section
        [:div.row
         ;;left section
         [:div.span6
            [:div.well
              [:h3 "Tim Sulg"]
              [:dl.dl-horizontal
                [:dt "Contact"]
                [:dd "timgluz@gmail.com"]
                [:dt "Short-bio"]
                [:dd "Datahacker, 
                     previous experience as data-analyst in Estonia
                     biggest bank (3year) and last 2 years been on 
                     startup-rollercoaster, 2times in StartupSauna warmup."]
                [:dt "Goal of this event"]
                [:dd "To find good team (prefer multi-national) 
                     to create something great.
                     Alternative plan:
                     i'll back-bag through Lithuania to Berlin."]
                [:dt "Prog.Languages"]
                [:dd "Clojure, Python, C, JS"]]
                (image "/img/clojure.png" "Logo")
              ]]
         ;;right section
         [:div.span6
            [:div 
              [:h3 "About backend"]]
            [:dl.dl-horizontal
              [:dt "PaaS provider"]
              [:dd "dotCloud - easy and handles ssh-connections well"]
              [:dt "Database"]
              [:dd "MongoDB - look our "]
              [:dt "Web stack"]
              [:dd "I am using Noir - minimal(meaning ascetical,
                   without bullshit) 
                   webframework which is written in Clojure. 
                   For front-end, i usually use backbone+underscore,
                   jQuery in Bootstrap sauce."]
              [:dt "Source code"]
              [:dd 
                (link-to "https://github.com/buildit-rocks/web"
                         "Github account for BuildIt")]]]
              
         ]
       ]))
