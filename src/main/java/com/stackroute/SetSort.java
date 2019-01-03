package com.stackroute;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetSort {
    Set<String> setSort(String[] strings){

        TreeSet<String> set=new TreeSet<String>();
        for (String str:strings) {
            set.add(str);
        }
        return set;

    }
    ArrayList<String> setSortArr(Set set){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);
        return  arrayList;
    }

}

