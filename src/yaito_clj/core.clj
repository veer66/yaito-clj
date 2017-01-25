(ns yaito-clj.core
  (:import net.veerkesto.PrefixTree)
  (:import kotlin.Pair)
  (:import net.veerkesto.Yaito)
  (:require [clojure.string :as str]
            [clojure.java.io :as io])
  (:gen-class))

(defn load-words-from-path [path]
  (->> (slurp path)
       (str/split-lines)))

(defn load-words [& paths]
  (->> paths
       (mapcat load-words-from-path)
       distinct
       sort
       (into-array String)))

(defn read-dict-from-bundle [& filenames]
  (apply load-words
         (map io/resource filenames)))

(defn create-tokenizer [dix]
  (Yaito. dix))

(defn tokenize [tokenizer text]
  (into [] (.tokenize tokenizer text)))
