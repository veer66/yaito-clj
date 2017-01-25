(ns yaito-clj.core-test
  (:require [clojure.test :refer :all]
            [yaito-clj.core :refer :all]))

(deftest tokenizer-test
  (testing "basic tokenizer"
    (is (=
         (let [dict (read-dict-from-bundle "tdict-std.txt")
               tokenizer (create-tokenizer dict)]
           (tokenize tokenizer "กากา"))
         ["กา" "กา"]))))
