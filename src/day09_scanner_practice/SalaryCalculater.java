package day09_scanner_practice;
public class SalaryCalculater {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate");
        //assume 40 hours of week in a week
        //enter hourle rate;
        //hourlyrate 50.0
        //weekly pay
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate*40;
        double monthlyPay = weeklyPay * 52/12; //Weekly *4; < might not be accurate
        double annualPay = monthlyPay *12;
        System.out.println("Weakly pay: " + weeklyPay);
        System.out.println("Monthly pay: " + monthlyPay);
        System.out.println("AnnualPay: " + annualPay);


    }
}
