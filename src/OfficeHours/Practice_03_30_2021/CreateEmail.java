package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class CreateEmail {
    public static void main(String[] args) {

        /*
                [Creating an email]

             Ask user to enter two Strings. Both of these String should be at least 6 characters long. If they are shorter
              than that print "Invalid data" and program should end.
              If the information provided is valid, you take the first 4 characters of first String and combine them
              with the last three characters of the second String. At the end of your combined String add "@cybertek.com"
              and print the final String as your created email. The final email should be in all lowerCase.
              input: JamesBond Secret
              output: jameret@sybertek.com
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = scan.nextLine();
        String wordTwo = scan.nextLine();
        String email = "";

        if(wordOne.length() >= 6 && wordTwo.length() >= 6){

            email = wordOne.substring(0, 4); //james
            email = wordTwo.substring(wordTwo.length() -3); // Secret // here -1 giving us index t //if change 3 giving us last 3 characters
            email = "@sybertek.com";

        }else{
            System.out.println("Invalid data");
        }



    }
}
