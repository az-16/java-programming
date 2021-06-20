package day54_abstractions;

/**
 * -> we add abstract keyword to a class t make an abstract class.
 * we can not create object of Student class - meaning:
 *      Student student = new Student(); will show ERROR
 * -> What we can do
 */
public  abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }
}