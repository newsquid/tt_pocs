(ns tt.handler
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :refer [resource-response response]]
            [ring.middleware.json :as middleware]))

;;(def fib (cons 1 (cons 1 (lazy-seq (map + fib (rest fib))))))

(defn longrunning []
        (Thread/sleep 5000)
        "ok")

(defroutes app-routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (GET "/posts" [] (response [{:name "Post 1"} {:name "Post 2"}]))
  (GET "/longrun" [] (response (longrunning)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/api app-routes)
      (middleware/wrap-json-body)
      (middleware/wrap-json-response)))
