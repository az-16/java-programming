package day50_inheritence;
                // IS-A
public class Student extends Person{
    // I want to add anything specific to the student
    String school;

    public void study(String topic) {
        //name from parent class (PERSON CLASS)
        System.out.println(name + " is studying " + topic+ " at " + school);
        System.out.println("age is " + age);

    }



}
