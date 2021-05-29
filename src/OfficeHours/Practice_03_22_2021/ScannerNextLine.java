package OfficeHours.Practice_03_22_2021;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {


/** DIFFERENCE BETWEEN next() AND nextLine() */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt(); //here just read single word
        System.out.println("Enter your name");
        input.nextLine(); //when we put this it will read a String value from the console multiple words
        String name = input.nextLine(); //if I CHANGE TO nextLine
        System.out.println(number);
        System.out.println(name);

    }
}

