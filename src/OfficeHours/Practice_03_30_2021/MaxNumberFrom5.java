package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class MaxNumberFrom5 {
    public static void main(String[] args) {
//        /*
//        [Max and Min from 5 numbers]
//
//        -Write programm that can ask the user "enter a number" five times amd return the maximum number
//        -Write programm that can ask the user "enter a number" five times amd return the minimum number
//         */
//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int first = input.nextInt();
//        int max = first; // 132
//        int min = first;
//
//        for(int i=0; i < 4; i++ ) {
//            System.out.println("Enter a number");
//            int number = input.nextInt();
//
//            if(number > max) {
//                max = number;
//            }
//            if(number < min) {
//                min = number;
//            }
//
//        }
//        System.out.println("max: " + max);
//        System.out.println("min: " + min);

        String sentence = "Java is a fun language output"; // sentence.substring(5,10);
                            // I love java --Love java I
        String firstWord = sentence.substring(0, sentence.indexOf(" ")); //--> (0,4) we are writing dynicly
        String newSentence = sentence.substring(sentence.indexOf(" ")) + " "+ firstWord;
        System.out.println(newSentence);

        String str = "   I love Java   ";
        System.out.println(str.trim());


        //==========


        String input1 = "JamesBond";
        String input2 = "Secret";

        if (input1.length() >= 6 && input2.length() >6){
            String first = input1.substring(0, 4).toLowerCase();
            String last3Characters = input2.substring(input2.length()-2).toLowerCase();

        }else
        System.out.println("Invalid data");

    }

}
