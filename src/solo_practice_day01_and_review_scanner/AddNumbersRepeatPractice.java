package solo_practice_day01_and_review_scanner;
import java.util.Scanner;
public class AddNumbersRepeatPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = scan.nextInt();
         int num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println("Result: " + result);
    }
}
