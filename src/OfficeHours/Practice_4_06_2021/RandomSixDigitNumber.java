package OfficeHours.Practice_4_06_2021;

import java.util.Random;

public class RandomSixDigitNumber {
    /*
   CHALLENGE = THIs WILL MAY BE DIFFICULT BUT TRY IT. DON'T SPEND TOO MUCH TIME. Generate a RANDOM NUMBER that is six digits long.
    Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers
     (6 different number meaning u never get duplicate numbers 1122345) u number should different 6 numbers: ex.184567 -each digit will be unique
     but u always get a random number.
    that make it up. Print the number.
    HINTS: Loops, Strings, Random
    1.CREAT RANDOM OBJECT. make u import util package
    important part loop will stop when I have 6 number
    We can use string b/c String method contains
    2. print random.nextInt(10) when run bacicly 0-9. 10 is not not included
    every time run we will get random number.
     */
    public static void main(String[] args) {
        Random random = new Random();
       String randomNumber = ""; //beginning is empty until 6 characters
        //we don't know how much iteration will take. In this case while loop very helpful
        while (randomNumber.length() != 6) { //it will run until my string has 6 number: line 20
            int eachRandom = random.nextInt(10); //3 (generate
            //int eachRandom = random.nextInt(9)+1; //1-9
            if (!randomNumber.contains("" + eachRandom)) {
                //here adding if we are checking double. //here we adding ""- to make a string amd concatinate
                randomNumber += eachRandom;
            }
            System.out.println(random.nextInt(10)); //0-9 //I want keep jenerating number pretty much until get 6 digits number. How can do this?// I want to generate a random number until number we don't already. using digit 0 I don't want it again.
        }
        System.out.println("Random number: " + randomNumber); //every numbers are unique
    }

}