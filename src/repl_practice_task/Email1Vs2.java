package repl_practice_task;
import java.util.Scanner;
public class Email1Vs2 {
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
             if(!email.contains("_")){
            System.out.println(email);
            int underScoreIndex = email.indexOf("_");
            int atSignIndex = email.indexOf("@");
            String firstName = email.substring(0, underScoreIndex);
            String lastName = email.substring(underScoreIndex +1, atSignIndex);
            System.out.println(lastName + "_" + firstName + "gmail.com");



        }


    }
}
