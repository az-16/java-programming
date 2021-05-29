package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        //using for loop print 15 stars in same line
        // "*****************************";
       // int stars = 0 I don't need to that i can do everything in one place

        for(int stars = 1;
                 stars <= 15;
                            stars ++){
            System.out.print("\uD83C\uDf1F **");
        }
        String myStars = "";
        //for loop: fill 5 stars to myStars variable

        for(int stars = 1; stars <= 5; stars++){
            //myStars = myStars + "* ";
            myStars += "* ";
        }
        System.out.println("my stars = " + myStars); // * * * * *


        System.out.println();//start new line
       // String myStars = "";
        //for loop: fill 5 stars to myStars variable.

        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        System.out.println("my stars = " + myStars.trim()); //* * * * *

        myStars = "";
        for(int i = 1; i <= 5; i++) {
            myStars += "* ";
        }
        System.out.println("my stars = " + myStars.trim());




    }



}
