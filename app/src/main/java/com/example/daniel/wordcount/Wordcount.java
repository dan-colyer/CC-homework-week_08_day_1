package com.example.daniel.wordcount;

/**
 * Created by Daniel on 13/11/2017.
 */

public class Wordcount {

    private int count = 0;

    public void Wordcount(int count) {
        this.count = count;
    }

    public int wordcount(String input) {
        String[] words = input.split(" ");
        return words.length;
    }

//    String[] words = input.split(" ");

//    public int wordCount(String words) {
//
//    }
}
