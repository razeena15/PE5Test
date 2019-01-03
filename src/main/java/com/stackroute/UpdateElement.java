package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
    public List<String> array(List<String> list_Strings,String str1,String str2)
    {






        list_Strings.set(0, str1);
        list_Strings.set(2, str2);
        return list_Strings;
    }
    public List<String> updateArray(List<String> list_Strings)
    {



        list_Strings.clear();

        return list_Strings;
    }


}
