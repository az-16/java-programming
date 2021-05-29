package day23_string_manipulation_while_loop;

public class ChangingStringMethods {
    public static void main(String[] args) {

        String word = "wooden spoon";

        System.out.println(word.toUpperCase().toLowerCase().length()); // in String class we can change some of the methods, it will run left to right

        String color = "WHITE laptop";
        System.out.println(color.toLowerCase().toUpperCase().length());

        String smart = "a pp le I ph o n e";
        // remove space, everything to UpperCase
        System.out.println(smart.replace(" ", "").toUpperCase()); //changing here



        //selenium.findElement(By.id("hi")).click(); //in selenium we will do like this

        String city = "KYRGYZSTAN";
        //read first letter.make Ucase + read 2nd till last.make lowercase
        //make UpperCase to first letter
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

    }
}
