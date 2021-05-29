package repl_practice_task;
 import java.util.Scanner;

public class PrintMiddleThree {
    public static void main(String[] args) {

        /**
         * Given a String variable word print the middle three characters if the word is an odd number
         * of characters and has more than 5 characters. If the word does not meet the requirements print
         * invalid.
         *
         * fifteen ==> fte
         * fifteen ==> fte
         * apple ==> ppl
         * apple ==> ppl
         * hey ==> invalid
         * hey ==> invalid
         * java ==> invalid
         * java ==> invalid
         * whatsup ==> ats
         * whatsup ==> ats
         * $ ==> invalid
         */
         Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int start = word.length() / 2 - 1;
        int end = word.length() / 2 + 2;

        if (word.length() % 2 == 1 && word.length() >= 5) {
            System.out.print(word.substring(start, end));
        } else {
            System.out.print("invalid");
        }


//        String word1 = "Margaritka";
//        System.out.println(word1.length()-1);
//        System.out.print(word1.substring(0, 10));


    }

}
