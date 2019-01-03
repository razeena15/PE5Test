package com.stackroute;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class SetInterfaceTest
{

    SetInterface setInterface=new SetInterface();

    @Test
    public void setInter()
    {
        String[] str={"Harry","Olive","Alice","Bluto","Eugene"};
        Set set=new HashSet<String>();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");



        assertEquals(set,setInterface.setSort(str));

    }
}
