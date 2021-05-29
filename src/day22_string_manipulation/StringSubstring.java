package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args){
        String word = "java is fun";
        /**
         * 1) word.substring(startIndex, endIndex)
         * endIndex is not included
         */
        System.out.println(word.substring(0, 4)); //java
        // how do i make sure is java?
        System.out.println(word.substring(0, 7));
        //print is
        System.out.println((word.substring(5, 7))); //ending number is 6. but is not included. So that way we put 7
        //priny fun
        System.out.println(word.substring(8, 11));

        /**
         * 2) substring(startIndex) - it will read from start until end
         */

       System.out.println(word.substring(8));
       //print is fun
        System.out.println(word.substring(5));


    }
}
