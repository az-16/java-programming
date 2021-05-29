package iq_java_code;

import java.util.Arrays;

/**
 * 5. Number palindrome.
 *  // isPalNum(545)   -> true
 *   // isPalNum(1001)  -> true
 *   // isPalNum(13)    -> false
 *   // isPalNum(33)    -> true
 */

public class NumberPalindrome {

        public static void main(String[] args) {

            int num = 1234321; // 1234321 => length
            // 0123456 == index
            System.out.println(isPalindromeNUm(num));


        }
        public static boolean isPalindromeNUm(int num){
            String text = String.valueOf(num);  //here we converted primitive to object

            for(int i = 0; i < text.length()/2; i++){  // -i we used to locate the correct number on the right side

                if(text.charAt(i) != text.charAt(text.length()-1-i)) {
                    return false;
                }
            }
            return true;
        }
    }

