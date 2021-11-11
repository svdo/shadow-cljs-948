(ns my-client.about.core
  (:require [helix.core :refer [$ defnc]]
            [helix.dom :as d]
            ["react-bootstrap" :refer [Container Row Col]]
            ["react-dom" :as rdom]))

(defnc About []
  ($ Container
     ($ Row
        ($ Col
           (d/h1 "About")))))

(defn ^:export start
  []
  (rdom/render ($ About) (js/document.getElementById "app")))
