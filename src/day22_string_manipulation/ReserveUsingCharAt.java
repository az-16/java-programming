package day22_string_manipulation;
import java.lang.*;
public class ReserveUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        //print using single statement and concat +
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) // "" if we put String empty one it is gonna be printed same line
                                + word.charAt(0));

        // ASSIGN TO VARIABLE reverse order back
        String  reversed = "" + word.charAt(3) + word.charAt(2) + word.charAt(1)
                + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);

        //check word is palindrome

        if (word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome word");
        }else{
            System.out.println("It is not Palindrome");
        }

    }
}
