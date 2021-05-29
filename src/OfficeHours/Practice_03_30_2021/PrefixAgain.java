package OfficeHours.Practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {
        /**
         * Given a String str and a number n check if the prefix (made of up of the first n characters)
         * appears in the remaining part of the String. Print true or false.
         *
         * Assume that the String is not empty and that n is in the range from 1 to str.length().
         * Examples:
         * input: abXYabc
         * input:1
         *
         * output: true
          */

        String str = "abXYabc";            //abXYabc             //prefix means first couple of letters
        int n = 2;                  // 3
                                 // abX    Yabc  // rest of the string means word after the prefix

        String prefix = str.substring(0,n);    // 0, 2                             //here we need multiple characters
        String remaining = str.substring(n); //XYabc

        System.out.println(remaining.contains(prefix));


    }
}
