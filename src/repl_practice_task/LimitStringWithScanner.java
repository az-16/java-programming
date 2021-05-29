package repl_practice_task;

import java.util.Scanner;


public class LimitStringWithScanner {

    /**
     * This method gets a string and an int, it returns a string.
     *
     * The method will limit the given String by a certain amount of characters(given int)
     *
     * Examples:
     *
     * limit("abcd",2)
     *
     * returns "ab"
     * limit("abcd",2)
     *
     * returns "ab"
     * limit("bla bla",3)
     *
     * returns "bla"
     */
    public static String limit(String text, int maxLength){
        //System.out.println(text.substring(0, maxLength)); not correct
        return text.substring(0, maxLength);
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.println(limit(in.nextLine(), in.nextInt()));

}
}
