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
        Student student1;
        Student student2;
        Student student3;
        Student student4;
        Student student5;


        @Before
        public void setUp() throws Exception {
            studentList=new ArrayList<Student>();

            student1=new Student();
            student1.setId(11);
            student1.setName("Dany");
            student1.setAge(35);

            student2=new Student();
            student2.setId(12);
            student2.setName("Austin");
            student2.setAge(25);

            student3=new Student();
            student3.setId(13);
            student3.setName("Elle");
            student3.setAge(2);

            student4=new Student();
            student4.setId(14);
            student4.setName("Catherine");
            student4.setAge(28);

            student5=new Student();
            student5.setId(15);
            student5.setName("Alaia");
            student5.setAge(1);


        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void compare() {
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);

            List<Student> expected= new ArrayList<>();
<<<<<<< HEAD
            expected.add(studentObj1);
            expected.add(studentObj4);
            expected.add(studentObj2);
            expected.add(studentObj3);
            expected.add(studentObj5);
//   System.out.println(expected);
=======
            expected.add(student1);
            expected.add(student4);
            expected.add(student2);
            expected.add(student3);
            expected.add(student5);
//  System.out.println(expected);
>>>>>>> 38588559d907eac2fb67cc8b06e7fa8292634d19


            assertEquals(expected,new StudentSorter().sortingStudent(studentList));


        }
    }

