package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        /**
         * String message = "Sender: [Nadir] From Number<2223334444> Message:{Hello, lets code some java}";
         * declare: message,start, end, mobile, text
         */
        String message = "Sender: [ Aizat ] From Number<(312)914-5456> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start +1, end));

        String sender = message.substring(start+1, end); //here we stored message into sender
        System.out.println("sender = " + sender);

        // find phone number and combine
        String mobile = message.substring(message.indexOf("<") +1, message.indexOf(">")); //HOW WE DO FIND WHAT NUMBER IS THIS? EVALUATE
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{") +1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Nazi ".trim());

        sender = sender.trim();
        if (sender.equals("Aizat")){
            System.out.println("Sender is Aizat about homework");
        }else{
            System.out.println("Someone else message");
        }


    }
}
