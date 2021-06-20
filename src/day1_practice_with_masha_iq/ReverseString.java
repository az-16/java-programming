package day1_practice_with_masha_iq;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String word = "smart";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println("reversed = " + reversed);


        String[] word2 = new String[1];
        word2[0] = "java";
        //String word reverse with Array
        //If I want to reverse word with Array I have to create char Array b/c I need to work with each letter
        String word4 = "java";

        //here I am converting word4 into toCharArray
        char [] reverse = word4.toCharArray();

        // if I want to print Array I have to write Arrays.toString(inside my Array)
        System.out.println(Arrays.toString(reverse));

        String reversed2 = "";
        //here to reverse array I have use for loop storing (indexes(this is i) of the ARRAY to reverse)
        for(int i = reverse.length-1; i >= 0; i--) {
            //here i am storing reversed2 reversed [i]
            reversed2 += reverse[i]; //inside the array  put "i" b/c char array assigned in to the i
        }
        System.out.println(reversed2);
    }
}


