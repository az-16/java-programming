package repl_practice_task;

import java.util.Scanner;

public class PrintMiddleOneV3 {
    public static void main(String[] args) {
        /*
        /**
         * You have a word, do the following:
         *
         * When word has odd number of characters and:
         * 3 or more characters, print middle letter
         *       oak ==> a
         *       oak ==> a
         *       javav ==> v
         *       javav ==> v
         * Single character, print that character 3 times
         *       # ==> ###
         *       # ==> ###
         *       q ==> qqq
         *       q ==> qqq
         * When word has even number of characters and:
         * 4 or more characters, print the middle 2 characters
         *      java ==> av
         *      java ==> av
         *      apples ==> pl
         *      apples ==> pl
         *      #$%^&* ==> %^
         *      #$%^&* ==> %^
         * 2 characters, print those 2 characters twice
         *       @@ ==>@@@@
         *       @@ ==>@@@@
         *       $$ ==>$$$$
         *       $$ ==>$$$$
         *       hi ==> hihi
         */


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
/*
        String text = "abdefdh"; // 4/2 =2 => 4/2-1=1
        //5/2=2

        if(text.length()%2 ==0) {
            //even
            for(int i=0; i<2; i++)
            System.out.print(text.substring(text.length()/2-1,text.length()/2+1));
        }else {
            //odd
            for(int i=0; i<3; i++) {
                System.out.print(text.charAt(text.length()/2));
            }
        }
 */             //even
        //length 5/2=2
        //      01234
        //str = smart
        if (str.length() % 2 == 0) {
            //print java= av
            for (int i = 0; i < 2; i++)
                System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
            // odd
        } else {
            //print a=aaa
            for (int i = 0; i < 3; i++) // it okey here if we don't put {
                System.out.print(str.charAt(str.length() / 2));
        }
    }
}
