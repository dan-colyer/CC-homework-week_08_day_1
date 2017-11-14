package com.example.daniel.wordcount;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 13/11/2017.
 */

public class WordcountTest {

    Wordcount wordcount;

    // Test 1
    @Test
    public void testWordcount() {
        wordcount = new Wordcount();

        String input1 = "Test Testing Tester";
        int actual1 = wordcount.wordcount(input1);
        assertEquals(3, actual1);

        String input2 = "Test Testing Tester extra";
        int actual2 = wordcount.wordcount(input2);
        assertEquals(4, actual2);

    }

    // Test 2
    @Test
    public void testShowWordFrequency() {
        wordcount = new Wordcount();

        String input1 = "One One Two Three Three Three";
        String actual = wordcount.showWordFrequency(input1);
        assertEquals("{One=2, Two=1, Three=3}", actual);
    }
}


