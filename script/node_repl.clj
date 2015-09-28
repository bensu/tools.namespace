(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.node)

(cljs.repl/repl (cljs.repl.node/repl-env)
  :watch (apply cljs.build.api/inputs "src/main/clojure" "src/test/clojure")
  :output-dir "out")
