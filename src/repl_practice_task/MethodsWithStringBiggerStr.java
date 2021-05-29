package repl_practice_task;

import java.util.Scanner;

public class MethodsWithStringBiggerStr {
    /**
     * The method accepts two strings and return the longest one
     *
     * Example":
     *
     * bigger("apple","orange") ==> "orange"
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.nextLine(), in.nextLine()));
    }
    public static String bigger (String a, String b) {
//        if(a.length() > b.length()) {
//           return a;
//        }else{
//           return b;
//        }
        // second way by using Ternary operators
        return (a.length() >= b.length()) ? a : b;

}
}
