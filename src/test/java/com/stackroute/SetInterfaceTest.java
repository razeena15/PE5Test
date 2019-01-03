package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static junit.framework.TestCase.assertEquals;

public class SetInterfaceTest {
    SetInterface setSort = new SetInterface();


    @Test
    public void setSortOne() {
        String[] strings = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        TreeSet set = new TreeSet();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");
        assertEquals(set, setSort.setSort(strings));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(set);

        assertEquals(arrayList, setSort.setSortArr(set));

    }
}