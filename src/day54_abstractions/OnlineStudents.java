package day54_abstractions;

/**
 * online Student class will EXTENDS abstract class
 * This class is considered to be concrete class.
 * It is responsible to implement all abstract methods (if any)
 */
public class OnlineStudents extends Student{
    /**
     * attendClass abstract methods is implemented by the sub class
     * Sub class is overriding the abstract methodnof Parent class
     */

    //@Override
    public void attendClass() {
        System.out.println("Online student is attending to class the using Zoom");
    }
}