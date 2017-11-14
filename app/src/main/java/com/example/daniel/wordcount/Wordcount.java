package com.example.daniel.wordcount;

import java.util.HashMap;

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

    public String showWordFrequency(String input) {
        String[] words = input.split(" ");
        HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();

        for (String s : words) {
            if (myWordsCount.containsKey(s)) myWordsCount.replace(s, myWordsCount.get(s) + 1);
            else myWordsCount.put(s, 1);
        }
        return myWordsCount.toString();
    }
}

//    public static void main(String[] args){
//        Scanner keyboard = new Scanner(System.in);
//        String[] myPhrase = keyboard.nextLine().split(" ");
//        HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();
//        for (String s : myPhrase){
//            if (myWordsCount.containsKey(s)) myWordsCount.replace(s, myWordsCount.get(s) + 1);
//            else myWordsCount.put(s, 1);
//        }
//        System.out.println(myWordsCount);
//    }