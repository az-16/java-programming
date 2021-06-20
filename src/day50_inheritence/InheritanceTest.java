package day50_inheritence;

import java.util.ArrayList;

//here we adding object class // runner class
public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        // I will going to create object of teacher
        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 35;
        t1.talk();
        t1.walk();
        t1.teach("java inheritance"); // talk, walk, teach from inheritance


        //here we are creating student object
        Student student = new Student();
        student.name = "Ali";
        student.age = 33;
        student.talk();
        student.walk();
        student.work("java programmer");
        student.school = "CybertekSchool";
        student.study("java programming inheritance");
    }
}
