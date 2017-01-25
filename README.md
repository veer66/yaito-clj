# yaito-clj

yaito-clj is a Clojure wrapper for yaito - a word tokenizer for ASEAN languages

## Install

[![Clojars Project](https://img.shields.io/clojars/v/yaito-clj.svg)](https://clojars.org/yaito-clj)

## Example

````clojure
(ns exper1      
  (:require [yaito-clj.core :as yaito]))

(let [tokenize (-> "tdict-std.txt"
                   yaito/read-dict-from-bundle
                   yaito/create-tokenizer)]
   (tokenize "กากา"))
````

