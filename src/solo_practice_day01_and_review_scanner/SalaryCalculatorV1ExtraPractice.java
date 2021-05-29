package solo_practice_day01_and_review_scanner;
import java.util.Scanner;
public class SalaryCalculatorV1ExtraPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate*40;
        double monthlyPay = weeklyPay * 52/12; //Weekly *4
        double annualPay = monthlyPay *12;
        System.out.println("Weakly pay: " + weeklyPay);
        System.out.println("Monthly pay: " + monthlyPay);
        System.out.println("AnnualPay: " + annualPay);
        //double hourlyRate
    }
}
