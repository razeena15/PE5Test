package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class WordOccurenceTest {
    WordOccurence wordOccurence=new WordOccurence();

    @Test
    public void countOccurenceOne() {
        String string= "one one -one___two,,three,one @three*one?two";
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("one",5);
        hashMap.put("two",2);
        hashMap.put("three",2);
        assertEquals(hashMap,wordOccurence.countOccurence(string));

    }



}