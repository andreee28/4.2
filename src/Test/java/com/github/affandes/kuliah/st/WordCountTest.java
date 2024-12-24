package com.github.affandes.kuliah.st;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordCountTest {

    @Test
    public void testWordCountAndAddWord() {
        WordCount wc = new WordCount();
        wc.wordCount("hello world hello");
        assertEquals(2, wc.wordCount.size());
        assertEquals(2, wc.wordCount.get(0).count);
        assertEquals(1, wc.wordCount.get(1).count);

        wc.addWord("test");
        wc.addWord("test");
        assertEquals(3, wc.wordCount.size());
        assertEquals(2, wc.wordCount.get(2).count);
    }
}
