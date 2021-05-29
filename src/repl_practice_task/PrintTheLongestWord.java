package repl_practice_task;
import java.util.Scanner;
public class PrintTheLongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         * Write a program that will print out the longest word.
         * Note: Assume the length of the two given Strings will be different
         *
         * input:
         * bill
         * check
         * input:
         * bill
         * check
         * output: check
         */

        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE
//        if (word1.length() > word2.length()){
//            System.out.println(word1);
//
//        }else if (word1.length() < word2.length()){
//            System.out.println(word2);
//        }
//
        //  WE CAN DO WITH TERNARY STATEMENT too
        System.out.println(word1.length() > word2.length() ? word1 : word2);
    }
}



