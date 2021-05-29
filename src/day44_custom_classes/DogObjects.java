package day44_custom_classes;

/**
 * this class is used to create object of class
 */
public class DogObjects {
    public static void main(String[] args) {
        Dog dog = new Dog ();
        System.out.println(dog.type);
        dog.run();
        dog.bark();
        dog.jump();

    }
}
