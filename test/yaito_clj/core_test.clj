(ns yaito-clj.core-test
  (:require [clojure.test :refer :all]
            [yaito-clj.core :as yaito]))

(deftest tokenizer-test
  (testing "basic tokenizer"
    (is (=
         (let [dict (yaito/read-dict-from-bundle "tdict-std.txt")
               tokenize (yaito/create-tokenizer dict)]
           (tokenize "กากา"))
         ["กา" "กา"]))))
