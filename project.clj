(defproject props "0.1.0"
  :description "Confortable way for get props from jvm-opts"
  :url "https://github.com/CHNB128/props"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns props.core}
  :profiles {:test {:jvm-opts ["-Dtest.value=Red-Hot-Chili-Peppers"]}})
