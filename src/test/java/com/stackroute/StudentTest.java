package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    List<Student> studentList;
        Student studentObj1;
        Student studentObj2;
        Student studentObj3;
        Student studentObj4;
        Student studentObj5;


        @Before
        public void setUp() throws Exception {
            studentList=new ArrayList<Student>();

            studentObj1=new Student();
            studentObj1.setId(11);
            studentObj1.setName("durga");
            studentObj1.setAge(21);

            studentObj2=new Student();
            studentObj2.setId(12);
            studentObj2.setName("james");
            studentObj2.setAge(22);

            studentObj3=new Student();
            studentObj3.setId(13);
            studentObj3.setName("madhu");
            studentObj3.setAge(23);

            studentObj4=new Student();
            studentObj4.setId(14);
            studentObj4.setName("anagha");
            studentObj4.setAge(23);

            studentObj5=new Student();
            studentObj5.setId(15);
            studentObj5.setName("james");
            studentObj5.setAge(24);


        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void compare() {
            studentList.add(studentObj1);
            studentList.add(studentObj2);
            studentList.add(studentObj3);
            studentList.add(studentObj4);
            studentList.add(studentObj5);

            List<Student> expected= new ArrayList<>();
            expected.add(studentObj5);
            expected.add(studentObj3);
            expected.add(studentObj4);
            expected.add(studentObj2);
            expected.add(studentObj1);
//   System.out.println(expected);


            assertEquals(expected,new Student().sortingStudent(studentList));


        }
    }
}
