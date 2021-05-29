package repl_practice_task;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        /**
         * Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.
         *
         * Examples:
         *
         * input: mike_tyson@gmail.com
         *
         * output: tyson_mike@gmail.com
         * input: mike_tyson@gmail.com
         *
         * output: tyson_mike@gmail.com
         * input: barakobama@gmail.com
         *
         * output: barakobama@gmail.com
         */
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName, lastName;
        int underScoreIndex,atSignIndex;

        if (!email.contains("_")) {
            System.out.println(email);
        } else if (email.contains("_")) {
            int num = email.indexOf("_");
            int domain = email.indexOf("@");
             firstName = email.substring(0, num);
             lastName = email.substring(num+1,domain );
            String last = ("gmail.com");
            System.out.println(""+lastName+"_"+firstName+"@"+last);
        }

    }
}
