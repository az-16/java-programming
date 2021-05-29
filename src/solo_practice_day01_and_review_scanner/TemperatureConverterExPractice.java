package solo_practice_day01_and_review_scanner;
import java.util.Scanner;
public class TemperatureConverterExPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your temperature you live:");
        double fahrenheiteValue = input.nextDouble();
        double celsiusValue = (fahrenheiteValue - 32) * 5 / 9;
        System.out.println( + fahrenheiteValue + " F is in C " + celsiusValue);

    }
}
