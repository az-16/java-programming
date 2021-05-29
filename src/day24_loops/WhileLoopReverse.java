package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        /**
         *
         int count = 5;

         count = 5
         count = 4
         count = 3
         count = 2
         count = 1
         count = 0
         */

        int count = 5;
        while(count >= 0){
            System.out.println("count = " + count);
            //here instead of using ++ we use -- b/c it is reverse
            count--;
        }
        System.out.println("Finished the count");


        /**
         * REad each message one by one until you have zero unread SMS
         * while unreadSMS is more than zero read one by one
         */

        int unreadSMS = 10;
        while(unreadSMS>= 0){
            System.out.println("I have total " + unreadSMS + "unread sms" );
            --unreadSMS;

        }
        System.out.println("I don't have unread SMS");
    }

}
