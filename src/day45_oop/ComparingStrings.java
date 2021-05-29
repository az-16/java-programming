package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; // in string pool
        String word2 = "java"; // re-used from String pool //when we are change Java it will not re-used. IT WILL RE=USE EXACTLY SAME.
                                // it will create separate one in POOL

        String word3 = new String("java"); //create NEW object in HEAP, outside String pool
        String word4 = new String("java");//create NEW object in HEAP, outside String pool

        System.out.println(word1 == word2); //true - point to the object in pool
        System.out.println(word1 == word3); //false - point to different object in HEAP and POOL
        System.out.println(word3==word4); //false b/c every time created NEW OBJECT // point to different objects in HEAP

        System.out.println(word1.equals(word2)); // true - comparing values
        System.out.println(word2.equals(word3)); //true
        System.out.println(word3.equals(word4)); //true
        // == never comparing the value, it will point to the same object/address in pool
        //.equals -> does not care how it was created it will comparing values. It is matching case by case, character
        //by character

    }
}
