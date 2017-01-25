# yaito-clj

yaito-clj is a Clojure wrapper for yaito - a word tokenizer for ASEAN languages

## Usage

````clojure
(let [dict (read-dict-from-bundle "tdict-std.txt")
               tokenizer (create-tokenizer dict)]
           (tokenize tokenizer "กากา"))
````

