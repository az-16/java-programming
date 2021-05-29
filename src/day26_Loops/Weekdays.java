package day26_Loops;

public class Weekdays {
    public static void main(String[] args) {
        /**
         * loop n =  1 - 10
         *
         * inside loop: using switch statement
         *     n -> 1 ->
         *         "1 - Monday"
         *     n -> 2 ->
         *         "2 - Tuesday"
         *     n -> 3 ->
         *         "3 - Wednesday"
         *     n -> 4 ->
         *         "4 - Thursday"
         *     n -> 5 ->
         *         "5 - Friday"
         *     n -> 6 ->
         *         "6 - Saturday"
         *     n -> 7 ->
         *         "7 - Sunday"
         *     n -> "8 - no such day, it is java day"
         * You do not have permission to send messages in this channel.
         */
//        int n = 1;
//        switch (n) {
//            case 1:
//                System.out.println(n + " - Monday");
//                break;
//            case 2:
//                System.out.println(n + " - Tuesday");
//                break;
//            case 3:
//                System.out.println(n + " - Wednesday");
//                // if (day == 1) {
        for(int day = 1; day<=10; day++){
        switch(day){
                case 1:
                    System.out.println(day + " - Monday");
                   break;
               case 2:
                   System.out.println(day + " - Tuesday");
                    break;
                case 3:
                    System.out.println(day + " - Wednesday");
                    break;
                case 4:
                    System.out.println(day + " - Thursday");
                    break;
                case 5:
                    System.out.println(day + " - Friday");
                    break;
                case 6:
                    System.out.println(day + " - Saturday");
                    break;
                case 7:
                    System.out.println(day + " - Sunday");
                    break;
                default:
                    System.out.println(day+ " - no such day, it is a java day");
            }


        }

    }
}



