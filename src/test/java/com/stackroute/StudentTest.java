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
            studentObj1.setName("Dany");
            studentObj1.setAge(35);

            studentObj2=new Student();
            studentObj2.setId(12);
            studentObj2.setName("Austin");
            studentObj2.setAge(25);

            studentObj3=new Student();
            studentObj3.setId(13);
            studentObj3.setName("Elle");
            studentObj3.setAge(2);

            studentObj4=new Student();
            studentObj4.setId(14);
            studentObj4.setName("Catherine");
            studentObj4.setAge(28);

            studentObj5=new Student();
            studentObj5.setId(15);
            studentObj5.setName("Alaia");
            studentObj5.setAge(1);


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
            expected.add(studentObj1);
            expected.add(studentObj4);
            expected.add(studentObj2);
            expected.add(studentObj3);
            expected.add(studentObj5);
//   System.out.println(expected);


            assertEquals(expected,new StudentSorter().sortingStudent(studentList));


        }
    }

