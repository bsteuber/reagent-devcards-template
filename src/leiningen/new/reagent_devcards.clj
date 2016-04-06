(ns leiningen.new.reagent-devcards
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main     :as main]))

(def render (renderer "reagent-devcards"))

(defn reagent-devcards
  "Template for reagent devcards development"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' reagent-devcards project.")
    (->files data
             [".gitignore" (render "gitignore" data)]
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["test/{{sanitized}}/core_test.cljs" (render "core_test.cljs" data)]
             ["test/{{sanitized}}/all_tests.cljs" (render "all_tests.cljs" data)]
             ["resources/public/index.html" (render "index.html" data)]
             ["resources/public/cards.html" (render "cards.html" data)]
             ["resources/public/css/{{sanitized}}.css" (render "style.css" data)])))
