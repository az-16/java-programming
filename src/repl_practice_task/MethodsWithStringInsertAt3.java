package repl_practice_task;

import java.util.Scanner;

public class MethodsWithStringInsertAt3 {
    /**
     * at3 accepts two strings and returns a string.
     *
     * The first string is the one that will be manipulated.
     * At the 3rd char position of target you will insert the word argument.
     *
     * Example:
     * at3("longword","foo")
     *
     * return: "lonfoogword"
     * at3("longword","foo")
     *
     * return: "lonfoogword"
     * at3("blabla","a")
     *
     * return: "blaabla"
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.nextLine(), in.nextLine()));


    }

    public static String at3 (String target, String addWord) {
      //"apple", yum, le
        //we have to concatenate rest of the word too
        //app+yum+le
        //first get 3
        return target.substring(0, 3) + addWord  + target.substring(3);

}

}
