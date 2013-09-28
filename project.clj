(defproject devfest-2013-chromeapp-angular-demo "0.1.0-SNAPSHOT"
  :description "Chrome Application for Visualizing Files"
  :url "http://www.meetup.com/seattle-gdg/events/125948972/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1909"
                  :exclusions [org.apache.ant/ant]]
                 [compojure "1.0.4"]
                 [hiccup "1.0.0"]]
  :plugins [[lein-cljsbuild "0.3.3"]
            [lein-ring "0.7.0"]]
  :source-paths ["src-clj"]
  :cljsbuild {
              :builds [{
                        :source-paths ["src-cljs"]
                        :compiler {
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :ring {:handler example.routes/app})
