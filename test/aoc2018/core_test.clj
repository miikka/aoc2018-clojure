(ns aoc2018.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [aoc2018.core :refer :all]))

(deftest puzzle1-test
  (testing "Part 1"
    (is (= 3 (puzzle1-part1 (parse1 example1))))
    (is (= 3 (puzzle1-part1 [1 1 1])))
    (is (= 0 (puzzle1-part1 [1 1 -2])))
    (is (= -6 (puzzle1-part1 [-1 -2 -3]))))
  (testing "Part 2"
    (is (= 2 (puzzle1-part2 (parse1 example1))))
    (is (= 0 (puzzle1-part2 [1 -1])))
    (is (= 10 (puzzle1-part2 [3 3 4 -2 -4])))
    (is (= 5 (puzzle1-part2 [-6 3 8 5 -6])))
    (is (= 14 (puzzle1-part2 [7 7 -2 -7 -4])))))

(deftest puzzle2-test
  (testing "Part 1"
    (is (= 12 (puzzle2-part1 (parse2 example2-part2)))))
  (testing "Part 2"
    (is (= "fgij" (puzzle2-part2 (parse2 example2-part2))))))

(deftest puzzle3-test
  (testing "Part 1"
    (is (= 4 (puzzle3-part1 (parse3 example3)))))
  (testing "Part 2"
    (is (= 3 (puzzle3-part2 (parse3 example3))))))
