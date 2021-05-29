package day38_methods;
/**
 * import all static methods. So you can just call ne method name, without class name
 */

import static day38_methods.StringUtilsGuava.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        //How can I check my uesrName is empty Or No?
        if(StringUtilsGuava.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");

        }
        System.out.println("isPalindrome(civic) = " + isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));
       String word = "java";
       String revWord = reverse(word);
        System.out.println("revWord = " + revWord);
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;

    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

    }
}
