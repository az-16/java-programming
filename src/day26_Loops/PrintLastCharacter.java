package day26_Loops;
import java.util.Scanner;
public class PrintLastCharacter {
    public static void main(String[] args) {
        /**
         * Write a program that will print out the last character of the word.
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
       System.out.println( "" + word.charAt(word.length()-1));


    }
}
