# yaito-clj

yaito-clj is a Clojure wrapper for yaito - a word tokenizer for ASEAN languages

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

