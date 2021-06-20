package day50_inheritence;

/**
 * Sub class;
 * Child class
 * Derived class
 */
public class Teacher  extends Person{

        int teacherID;


    public void walk() {
        System.out.println("Person is walking");
    }
    public void talk() {
        System.out.println("Person is talking");
    }
    public void work(String job) {
        System.out.println("Person is working as " + job);
    }


        public void teach(String topic) {
            System.out.println("Teacher is teaching " +topic);
        }
    }
