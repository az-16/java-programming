package iq_java_code;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {

    /**
     * 1. String reverse.
     * Write a method that will take one string as an argument and will return the reverse version of this string.
     * <p>
     * // reverseStr("apple")  -> elppa
     * // reverseStr("John")   -> nhoJ
     * // reverseStr("phone")  -> enohp
     * // reverseStr("123456") -> "654321"
     */

    public static void main(String[] args) {

        String word = "apple";

        //  String revWord = reverse(word);

        System.out.println(reverse(word));
        //System.out.println("revWord = " + revWord);
    }

    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;

    }
    }
//    public static void main(String[] args) {
//        ArrayList<String> words  = new ArrayList<>(Arrays.asList("during", "storm", "rain", "fell", "season", "cloudy", "safe"));
//       String s = "";
//      ArrayList<Integer> lengths = new ArrayList<>();
//      for(String word:words){
//          lengths.add(word.length());
//      }
//        System.out.println(lengths);
//
//    }
//        }
//
