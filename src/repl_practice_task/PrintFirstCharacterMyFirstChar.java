package repl_practice_task;

import java.util.Scanner;

public class PrintFirstCharacterMyFirstChar {
    public static void main(String[] args) {

        /**
         * Write a program that will print out the first character of the word.
         *
         * Ex:
         *
         * Input: jump
         * Input: jump
         * Output: j
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //charAt(location/index of the characters)
        char firstChar = word.charAt(0);
        System.out.println(firstChar);
    }
}
