package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args){
       /*
       add a class AmazonFreeShipping
add main method
import scanner
create scanner object
ask "Enter total price"
assign value to totalPrice from scan.nextDouble.

if totalPrice is more than or equal to 25.0
    print "FREE SHIPPING ELIGIBLE. Your order total: $55"
ELSE
    print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"
      print "THANKS FOR SHOPPING AMAZON"
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price");
        double totalPrice = scan.nextDouble();
        if(totalPrice >= 25.0) {
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: $" + totalPrice);
        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice + ". Less than minimum of $");
        }
        System.out.println("THANKS FOR SHOPPING AMAZON!");
    }
}
