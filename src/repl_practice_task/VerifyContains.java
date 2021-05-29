package repl_practice_task;
import java.util.Scanner;
public class VerifyContains {
    public static void main(String[] args) {
        /**
         * Write a program that will verify if the sentence contains word.
         * Print out the result as a boolean value.
         */
   //contains method from String class
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String sentence = scan.nextLine();
    System.out.println(sentence.contains(word));



    }
}
