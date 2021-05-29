package java_my_practice;

public class StringChangingMethod {
    public static void main(String[] args) {
        String city = "kyrgyzstan";
        //print first letter to UpperCase
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        //print whole word to UpperCase to LowerCase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());

        city = "chIcAgo";
        // read 1 letter. makeUcase + read 2nd till last make lowerCase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("City - " + capitalized);
    }
}
