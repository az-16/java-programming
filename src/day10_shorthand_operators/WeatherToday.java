package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args){
        /*
        weather, sunny, raining, very cold, very hot.
        import scanner
        create scanner object
        ask a question:
        How is the weather today?
        "cold"
        cold is a nice day today!
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.next();
       // String words  = scan.nextLine();
        //System.out.println("Wooden spoon is best spoon in planet");
        System.out.println(weather + " is a nice today!");
    }
}

