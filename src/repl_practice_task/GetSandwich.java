package repl_practice_task;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {
        /**
         * A sandwich is two pieces of bread with something in between. Print the string that is between the first and last
         * appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
         *
         * Example:
         *
         * input: breadjambread
         *
         * output: jam
         * input: breadjambread
         *
         * output: jam
         * input: xxbreadjambreadyy
         *
         * output: jam
         * copied!
         * input: xxbreadjambreadyy
         *
         * output: jam
         * input: xxbreadapple
         *
         * output: nothing
         * input: xxbreadapple
         *
         * output: nothing
         * input: breadbutterbread
         *
         * output: butter
         */


        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int length = str.length();
        if (length >= 11 && str.contains("bread")) {
            String part1 = str.substring(0, str.indexOf("bread")+5);
            String part2 = str.substring(str.indexOf("bread") + 5);
            if (!part2.contains("bread")) {
                System.out.println("nothing");
            } else {
                String between = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
                System.out.println(between);
            }

        } else {
            System.out.println("nothing");
        }
    }
}