(defproject aoc2018 "0.1.0-SNAPSHOT"
  :description "Advent of Code 2018... in Clojure"
  :url "https://github.com/miikka/aoc2018-clojure"
  :dependencies [[org.clojure/clojure "1.10.0-RC5"]
                 [metosin/potpuri "0.5.1"]
                 [com.bhauman/rebel-readline "0.1.4"]
                 [org.clojure/tools.namespace "0.3.0-alpha4"]]
  :aliases {"rebl" ["trampoline" "run" "-m" "rebel-readline.main"]}
  :plugins [[metosin/bat-test "0.4.0"]])
