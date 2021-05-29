package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length); //2
        int countOfA = array.length - 1;
        if (word.endsWith("a")) { //if ends with a add one more
            countOfA++;

        }
        System.out.println( "countOfArr: " + countOfA);

        System.out.println("-----Split with empty space-----");
        String[] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);

        String word2 = "java1sql2html";
        String[] str = word2.split("\\d");
        System.out.println(Arrays.toString(str));

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }
}