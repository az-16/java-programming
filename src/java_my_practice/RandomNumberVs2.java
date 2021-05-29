package java_my_practice;
import java.util.Random;

public class RandomNumberVs2 {
    public static void main(String[] args) {
        /**
         *  CHALLENGE = THIs WILL MAY BE DIFFICULT BUT TRY IT. DON'T SPEND TOO MUCH TIME. Generate a RANDOM NUMBER that is six digits long.
         *     Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers
         *      (6 different number meaning u never get duplicate numbers 1122345) u number should different 6 numbers: ex.184567 -each digit will be unique
         *      but u always get a random number.
         *     that make it up. Print the number.
         *     HINTS: Loops, Strings, Random
         */

        Random random = new Random();
        String randomNumber = "";
        while (randomNumber.length() != 6) {
            int eachRandom = random.nextInt(10); //0-9   10 is not included
            if(!randomNumber.contains("" + eachRandom)){
                randomNumber+=eachRandom;

            }
            System.out.println(random.nextInt(10));

        }
        System.out.println(randomNumber);

    }
}

