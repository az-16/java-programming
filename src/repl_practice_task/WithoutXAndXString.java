package repl_practice_task;

import java.util.Scanner;

public class WithoutXAndXString {
    /**
     * Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
     * otherwise print the string unchanged.
     *
     * Example:
     *
     * input: xHiX
     *
     * output: Hi
     * input: xHiX
     *
     * output: Hi
     * input: apple
     *
     * output: apple
     * copied!
     * input: apple
     *
     * output: apple
     * input: xUxL
     *
     * output: UxL
     * input: xUxL
     *
     * output: UxL
     * input: JavaX
     *
     * output: Java
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //substring helps us get first character
        //xJavaX
        if(word.substring(0,1).equalsIgnoreCase("X")){
            word = word.substring(1);
        }
        if(word.substring(word.length()-1).equalsIgnoreCase("X")){
            word = word.substring(0, word.length()-1);
        }
        System.out.println(word);

    }



}
