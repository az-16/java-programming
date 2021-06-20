package day50_inheritence.overriding;

public class Cat extends Animal{
   //jump is just behavior
    public void jump() {
        System.out.println("Cat is jumping");


    }
   // @Override -> obtional
public void speak() {
    System.out.println("Cat is saying Meow..");
}
}
