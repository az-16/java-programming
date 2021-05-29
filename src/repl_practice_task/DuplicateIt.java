package repl_practice_task;
import java.util.Scanner;
public class DuplicateIt {
    public static void main(String[] args) {

        /**
         * You have 2 words
         *
         * Print the first word, second word, second word, first word
         *
         * Input:
         *
         * one
         *
         * two
         * Input:
         *
         * one
         *
         * two
         * Output:
         *
         * onetwotwoone
         */
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //we can duplicate in 2 ways
       // System.out.println(word1 + word2 + word2 + word1);

        //second way using same + but write just word concat()
        System.out.println(word1.concat(word2).concat(word2).concat(word1));


    }
}
