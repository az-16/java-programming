package day09_scanner_practice;
import java.util.Scanner;
public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        //scan.nextInt();
        int age = scan.nextInt(); //int age = 29
        System.out.println(age + " -that's a great age!");
        //scan.close(); optionally close the scanner

    }
}
