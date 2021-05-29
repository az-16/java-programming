package java_my_practice;
import java.util.Scanner;
public class GiveMe7$ {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Give 7 dollar");
        int dollar = scan.nextInt();

        while( dollar != 7){
            System.out.println("Give me 7 dollar");
            dollar = scan.nextInt();
        }

        System.out.println("Thank you for 7 dollar");
    }
}