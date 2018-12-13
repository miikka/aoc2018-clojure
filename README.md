# Advent of Code 2018... in Clojure!

[Advent of Code](https://adventofcode.com/2018) is an advent calendar of small
programming puzzles. This repository contains a starter kit for solving this
year's puzzles in Clojure.


## Prerequisites

You need to have Java and [Leiningen](https://leiningen.org) (a Clojure project
management tool) installed. Java 8 is guaranteed to work, but the later
versions should work as well. You do not need to install Clojure separately –
Leiningen will take care of it.

The two editors with the best Clojure support are Emacs with
[CIDER](https://docs.cider.mx/en/latest/) and IntelliJ IDEA with
[Cursive](https://cursive-ide.com). If you get serious about Clojure, you
should set up a REPL connection to your editor, but you can get started just
fine without one.


## Getting started

First, clone this repo:

```sh
git clone https://github.com/miikka/aoc2018-clojure
cd aoc2018-clojure
```

Clojure development is done via the REPL, so launch a REPL.

```sh
lein rebl
```

<small>That's right, it says *rebl*, not *repl*. The basic REPL is pretty plain,
so I've included [a nicer REPL](https://github.com/bhauman/rebel-readline). You
can use `lein repl` if you want, though.</small>

You should get a prompt that says `user=>`. That means that you're in the
`user` namespace. Enter some Clojure such as `(println "Hello world!")` or `(+
1 2)` to see if they work.

Open the file `src/aoc2018/core.clj` in your editor. This file defines the
`aoc2018.core` namespace. You can load it in the REPL:

```clojure
(require '[aoc2018.core :refer :all] :reload)
```

Here `:reload` means that `aoc2018.core` gets reloaded every time you run this
command. After you have edited `core.clj` in your editor, you can run this
command again to load the changes.

Since parsing the inputs is pretty boring, I've done it for you for the couple
of the firts puzzles. In `core.clj`, there's a function called `parse1` which
parses the input for [the puzzle of Day 1](https://adventofcode.com/2018/day/1).
You have to download your personal puzzle input yourself from that page, but
I've put an example input in the variable `example1`. Try it out:

```clojure
(println example1)
(parse1 example1)
(puzzle1-part1 (parse1 example1))
```

Download the input file and save it as `input1.txt` in the repository root. You
can load it into a string with `slurp`:

```clojure
(def input1 (slurp "input1.txt"))
(parse1 input1)
(puzzle1-part1 (parse1 input1))
```

In the first part, you're supposed to sum those numbers. The correct answer for
`example1` is `3`. Now... try things out in REPL or edit `core.clj`, reload, and
re-run until you've solved the puzzle?! Good luck!


## Unit tests

If you like working with TDD, that's cool. I've made some unit tests for you in
`test/aoc2018/core_test.clj`. You can run them from the command-line:

```sh
lein bat-test
```

If you want the tests to run automatically run whenever you save the files:

```sh
lein bat-test auto
```

If you're seeing too much red and want to focus on a specific test, use `:only`:

```sh
lein bat-test auto :only aoc2018.core-test/puzzle1-test
```


## Clojure sources of documentation

For finding the right function in `clojure.core`:

* ClojureDocs Clojure quickref: (https://clojuredocs.org/quickref

Understanding Clojure:

* Syntax: https://clojure.org/guides/weird_characters
* How destructuring works: https://clojure.org/guides/destructuring
* The threading macros a.k.a. arrows `->`, `->>`: https://clojure.org/guides/threading_macros

For parsing:

* clojure.string namespace https://clojure.github.io/clojure/clojure.string-api.html

Some further reading:

* Clojure.org's guide section: https://clojure.org/guides/getting_started
* clojure-doc.org has useful information: http://clojure-doc.org/articles/content.html
* I Love Ponies Clojure Workshop: https://iloveponies.github.io/
