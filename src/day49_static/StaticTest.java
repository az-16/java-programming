package day49_static;

public class StaticTest {
    static String word = "java"; //are we a direct access to print in line 15?
    public static void main(String[] args) {
        //rule num1 was static method can be called using classname
        StaticMethods.displayMessage("wooden spoon");

        //1) instance method needs an object to be called
        //StaticMethods.instanceMethod();ERROR
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2) static method can only access other static variables and methods
        //System.out.println(word); we can not access here.
        // if we are adding static in line 4 it will work
        System.out.println(word);
    }
}
