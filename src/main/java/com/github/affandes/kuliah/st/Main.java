package com.github.affandes.kuliah.st;

public class Main {
    public static void main(String[] args) {
        WordCount wordCount = new WordCount();
        wordCount.wordCount(args[0]);
        System.out.println(wordCount.wordCount);
    }
}