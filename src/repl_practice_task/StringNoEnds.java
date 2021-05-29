package repl_practice_task;
import java.util.Scanner;
public class StringNoEnds {
    public static void main(String[] args) {
        /**
         * Given a String txt print the value without the last letter
         *
         * Ex:
         *
         * Input:
         * foo
         * Input:
         * foo
         * Output:
         * fo
         * Output:
         * fo
         * Input:
         * run
         * Input:
         * run
         * Output:
         * ru
         * Output:
         * ru
         * Hint: Use substring() and length()
         */
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        // 0123  012
        // pear  pear we don't need it last index

        int lastIndex = txt.length()-1;
        System.out.println(txt.substring(0, lastIndex));
    }
}
