package day50_inheritence.overriding;

public class AnimalObjects extends Animal{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Pitbul";
         animal.speak();

         Cat cat = new Cat();
         cat.speak();
        // Dod dog = new Dog();
        // dog.speak();
    }
}
