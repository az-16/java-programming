package repl_practice_task;

import java.util.Scanner;

public class PrintMiddleOne {
    public static void main(String[] args) {
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
        String word = scan.next();


        /**
         * If branches order:
         *
         * 1 character -> print that char 3 times
         * 2 character -> print those 2 chars 2 times
         * 3 or more characters
         *      if odd print middle char
         *      else (even) print middle 2 chars
         */
//            int charCount = word.length();
//            if (charCount ==1){
//                System.out.println(word + word + word);
//            }else if(charCount ==2){
//                System.out.println(word + word);

        if(word.length()%2!=0){
            if(word.length()>=3){
                System.out.println(word.charAt(word.length() / 2));
            }else if(word.length()==1){
                System.out.println(word+word+word);
            }
        }else if(word.length()%2==0){
            if(word.length()>=4){
                System.out.println(""+word.charAt((word.length() / 2)-1)+word.charAt(word.length() / 2));
            }else if(word.length()==2){

                System.out.println(word.repeat(2));
            }
        }else{
            System.out.println("Invalid word");
        }

        // 70%2 != 0 odd
        //10+10+10+10+10+10+10
        //

            }
    }

