package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        //declare 3 variables, currentSpeed, speedLimit, isSpeeding
        //currentSPeed -> 45
        //speedLimit ->55
       // isSpeeding -> true if speeding, false if not speeding

        //print "Are u speeding? -" true/false
        int speedLimit = 5_5;
        int currentSpeed = 4_5;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding + "mph");
        System.out.println("isSpeeding = " + isSpeeding + "mph");



        //45 + 20
       // currentSpeed += 20; //65

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));

        //decrease balance by itemPrice, using short hand operators
        accountBalance = accountBalance - itemPrice;
        accountBalance -=itemPrice;



    }
}
