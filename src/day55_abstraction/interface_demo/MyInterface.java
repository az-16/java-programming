package day55_abstraction.interface_demo;

/**
 * interface keyword is used to create an interface in java;
 * CAN NOT create OBJECT OF JAVA
 */
public interface MyInterface {
    public abstract void learn();

}
interface MyInterface2{
    
}

/**
 * Class implements to inherit from it. It does not extend.
 * Class can implement
 */
class MyClass implements MyInterface{
    @Override
    public void learn() {
        System.out.println("Learning in  my class");
    } //here instead of writing extends we wrote IMPLEMENTS

}
class Main{
    public static void main(String[] args) {
        //object of interface
       // MyInterface myInterface = new MyInterface(); ERROR cannot create object of interface
        MyClass myClass = new MyClass();
    }
}