package day17_ternery_nested_conditions;

public class AmazonPrimeShoppingNestedIf {
    public static void main(String[] args) {
      /*
      add new class AmazomPrimeShopping
main method
itemPrice = 30;
isPrimeMember = true;
when isPrimeMember is true
    print "Eligible for free 2 day shipping"
otherwise
    when itemPrice is more than 25
        print "Eligible for free regular shipping"
    otherwise
        print "Not eligible for free shipping. fee is $10"

PSEUDOCODE: code written in human language. then it will be translated to java or other programming language

       */


        double itemPrice = 15.0;
        boolean isPrimeMember = false;
        if (isPrimeMember) {   // we don't have to put here like == true; boolean is optional.
            System.out.println("Free 2 day shipping eligible");
        } else {
            if (itemPrice >= 25.0) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.printf("Not eligible for free shipping. Fee is $10");

            }


        }
    }
}

