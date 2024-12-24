package com.github.affandes.kuliah.st;

import java.util.ArrayList;
import java.util.List;

public class WordCount {

    public List<WordInfo> wordCount;

    public WordCount() {
        wordCount = new ArrayList<>();
    }

    public void wordCount(String text) {
        for (String word : text.split(" ")) {
            addWord(word);
        }
    }

    public void addWord(String word) {
        if (wordCount.isEmpty()) {
            wordCount.add(new WordInfo(word, 1));
        } else {
            WordInfo found = wordCount.stream().filter(w -> w.word.equals(word)).findFirst().orElse(null);
            if (found == null) {
                wordCount.add(new WordInfo(word, 1));
            } else {
                found.count += 1;
            }
        }
    }

}
