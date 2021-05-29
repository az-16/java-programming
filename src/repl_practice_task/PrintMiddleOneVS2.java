package repl_practice_task;
import java.util.Scanner;

public class PrintMiddleOneVS2 {
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
        // 01234 //length 5/2=2
        //str = smart
        //str.charAt(str.length()/2) //odd version
        // even version
        //      012345
        //str = ghfgdj   middle:23
        //substring(2, 4)
       // System.out.println(word.substring(1,3));
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
   // for(int i = 0; i < 3; i++){
        //System.out.print(str);

    if(str.length() >= 3 && str.length()%2 == 0){ //0 will give even number
        System.out.println(str.substring(str.length()/2-1, str.length()/2+1));
//6/2=3-1=2    3+1=4

        for(int i = 0; i < 3; i++){

        }
    }
    }
    }