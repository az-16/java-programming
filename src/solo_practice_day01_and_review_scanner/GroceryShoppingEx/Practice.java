package solo_practice_day01_and_review_scanner.GroceryShoppingEx;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price of milk:");
        double banana = scan.nextDouble();
        System.out.println("Enter price of tomatoes:");
        double tomatoes = scan.nextDouble();
        double totalPrice = banana + tomatoes;
        System.out.println("Total price: " + totalPrice);

    }
}
