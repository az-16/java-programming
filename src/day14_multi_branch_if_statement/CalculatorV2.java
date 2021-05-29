package day14_multi_branch_if_statement;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {

        /*add main method
        COPY all code in CalculatorV1
        Change the Classname(

import scanner
        create scanner object
         print "enter 2 numbers"
         num1 -> 44.3
        num2 -> 23.4

        char operator = scan.next().charAt(0);
        print "enter operator: - , +, *, /"
        based on selection run if statement
                */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Enter operator: -, +, *, /");
        char operator = scan.next().charAt(0);

        if (operator == '+') { //if ir true execute it
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println("num1 *num2");
        } else if (operator == '/') {
            System.out.println(num1 / num2);

        } else {
            System.out.println("Just coding Java");

        }

    }
}
