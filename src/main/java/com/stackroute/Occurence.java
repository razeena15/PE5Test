package com.stackroute;

import java.util.*;

public class Occurence {

    public Map<String,Boolean> stringCount(String[] str)
    {
        Map<String,Boolean>map=new HashMap<>();
        boolean boolVal;
        for(String s:str)
        {
            if(!map.containsKey(s))
            {
                boolVal=false;
                map.put(s,boolVal);

            }
            else
            {
                boolVal=true;
                map.put(s,boolVal);
            }
        }
        return map;

    }
}