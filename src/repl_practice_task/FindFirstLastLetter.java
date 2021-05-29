package repl_practice_task;
import java.util.Scanner;
public class FindFirstLastLetter {
    public static void main(String[] args) {
        /**
         * Write a program that will print out first and last letters together.
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
       // charAt and substring can be used
        int charCount = word.length();
        System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));

        // with substring
        System.out.println(word.substring(0,1)  + word.substring(word.length()-1));




    }
}
