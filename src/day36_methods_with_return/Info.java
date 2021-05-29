package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        fullName(); //we returned Mike Smith
        System.out.println("Full name = " + fullName());
        System.out.println("Birth year = " + getRandomYear());// dynamic. different year each time
//       here we storing inside the variable
        String name = fullName(); //fullName assigning to name
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }


        public static String fullName(){
            System.out.println("Inside fullName method");
            return "Mike Smith";
}
    public static boolean isMarried() {

            return false;

    }
    public static int getAge(){
            int age = 35;
            return age; //return 35
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }


}
/*
Method name: fullName
No params
returns "Mike Smith"

Method name: isMarried
return false

method name: getAge
returns 35
You do not have permission to send messages in this channel.

 */