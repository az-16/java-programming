package day09_scanner_practice;

public class CentsToDollars {
    public static void main(String[] args){
        int cents = 123;
        int dollars = cents % 100;
        int remainingCents = cents % 100;
        System.out.println("In 123 cents: " + dollars + "$ "+ remainingCents + " cents" );
        //in 123 cents: 1 dollar and 23 cents
        System.out.println("In " + cents + " cents: " +dollars+ " dollars " +remainingCents+ " cents");



    }

}
