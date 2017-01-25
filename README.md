# yaito-clj

yaito-clj is a Clojure wrapper for yaito - a word tokenizer for ASEAN languages

## Install

[![Clojars Project](https://img.shields.io/clojars/v/yaito-clj.svg)](https://clojars.org/yaito-clj)

## Example

````clojure
(ns exper1
  (:require [yaito-clj.core :refer [read-dict-from-bundle
                                    create-tokenizer
                                    tokenize]]))

(let [tokenizer (-> "tdict-std.txt"
                    read-dict-from-bundle
                    create-tokenizer)]
  (tokenize tokenizer "กากา"))
````

