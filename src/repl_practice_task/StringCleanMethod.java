package repl_practice_task;

import java.util.Scanner;

public class StringCleanMethod {
    /*This method accept two strings (text and badWord) and returns a string.

    The method will take out all the occurrences of badWord in the text.

            Example:

    clean ("one two three","two")

    returns "one three"*/

    public static String clean(String text, String badWord) {
//        String[] strArr = text.split(" ");
//        String newWord = "";
//
//        for (int i = 0; i < strArr.length; i++) {
//            if (!strArr[i].equals(badWord)) {
//                newWord += " "+strArr[i];
//            }
//        }
//        return newWord;
        text = text.replaceAll(badWord, "").replaceAll("  ", " ").trim();
        return text;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }

}


