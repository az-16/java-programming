package repl_practice_task;
import java.util.Scanner;
public class PrintHalfTwice {
    public static void main(String[] args) {
        /**
         * Write a program that will print out first half of the word twice.
         *
         * Example:
         *
         * input: java
         *
         * output: jaja
         * input: java
         *
         * output: jaja
         * input: unity
         *
         * output: unun
         */

        Scanner scan = new Scanner(System.in);
        String word= scan.next();
       // HELLO = 5/2=2 the half index for odd char count
        //JAVA = 4/2 = 2 the half index for even char count

        int halfIndex = word.length()/2;
        String halfWord = word.substring(0, halfIndex);
        System.out.println(halfWord + halfWord);



    }
}
