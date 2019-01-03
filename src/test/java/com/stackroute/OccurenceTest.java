package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class OccurenceTest {

    Occurence countString=new Occurence();

    @Test
    public void counting()
    {
        String arr[]={"a","b","c","d","a","c","c"};
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,countString.stringCount(arr));

    }

    @Test
    public void counting1()
    {
        String arr[]={"1","1","2","1","2","3","3","4"};
        Map<String,Boolean> map=new HashMap<>();
        map.put("1",true);
        map.put("2",true);
        map.put("3",true);
        map.put("4",false);
        assertEquals(map,countString.stringCount(arr));

    }



}