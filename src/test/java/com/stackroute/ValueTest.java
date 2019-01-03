package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ValueTest {
    Value value=new Value();

    @Test
    public void replaceValue()
    {
        Map<String,String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","C++");
        Map<String,String> mapNew=new HashMap<>();
        mapNew.put("val1"," ");
        mapNew.put("val2","java");
        assertEquals(mapNew,value.replaceMap(map));
    }
}