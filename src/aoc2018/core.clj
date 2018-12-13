(ns aoc2018.core
  (:require [clojure.string :as str]))

;; Just a small helper function:
(defn parse-int
  "Parse the string x as an integer."
  [x]
  (Long/valueOf x))

;;;
;;; DAY 1
;;;

(def example1 "+1\n-2\n+3\n+1")

;; You can read files into strings with slurp:
;; (def input1 (slurp "input1.txt"))

(defn parse1
  "Parse input for day 1"
  [input]
  (map parse-int (str/split-lines input)))

(defn puzzle1-part1
  "Solution for https://adventofcode.com/2018/day/1 part 1"
  [changes]
  ;; Okay... how do you sum the frequency changes?
  changes)

(defn puzzle1-part2
  "Solution for https://adventofcode.com/2018/day/1 part 1"
  [changes])

;;;
;;; DAY 2
;;;

(def example2-part1 "abcdef\nbababc\nabbcde\nabcccd\naabcdd\nabcdee\nababab")

(defn parse2
  "Parse input for day 2"
  [input]
  (str/split-lines input))

(defn puzzle2-part1
  "Solution for https://adventofcode.com/2018/day/2 part 1"
  [input]
  ;; Pro-tip: strings are sequences just like vectors, so you can use functions
  ;; like reduce or group-by or partition-by on them...
  input)

(def example2-part2 "abcde\nfghij\nklmno\npqrst\nfguij\naxcye\nwvxyz")

(defn puzzle2-part2
  "Solution for https://adventofcode.com/2018/day/2 part 2"
  [ids]
  ids)

;;;
;;; DAY 3
;;;

(def example3 "#1 @ 1,3: 4x4\n#2 @ 3,1: 4x4\n#3@5,5: 2x2")

(defn parse-claim
  [claim-str]
  (let [[id x y width height] (map parse-int (re-seq #"\d+" claim-str))]
    {:id id, :x x, :y y, :width width, :height height}))

(defn parse3
  "Parse input for day 3"
  [input]
  (map parse-claim (str/split-lines input)))

(defn puzzle3-part1
  "Solution for https://adventofcode.com/2018/day/3 part 1"
  [claims]
  claims)

(defn puzzle3-part2
  "Solution for https://adventofcode.com/2018/day/3 part 2"
  [claims]
  claims)

;;;
;;; DAY N: You can do it!
;;;
