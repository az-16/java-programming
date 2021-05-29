package OfficeHours_04_27_2021;

import java.util.Arrays;

public class Anagram {

        /*
        [Anagram]

Create a method that will accept two Strings. Check if the two Strings are anagram of each other. If they are anagram
return true otherwise return false.

Anagram means the characters of the words are the same, but rearranged in different orders

For example:
    listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'
         */
        public static void main(String[] args) {

            System.out.println(isAnagram("abc", "cda"));
    }
//take 2 strings make them toCharArray ->sort -=equals
    //loop through one String -> remove the cahr that you iterate through
    // in the other String -> if empty the 2nd String isEmpty?
    //Anagram means characters are matching one String and second String
    //What does ARRAY do?

    public static boolean isAnagram(String one, String two){

            if(one.length() != two.length()) {
                return false;
            }
            one = one.toLowerCase();
            two = two.toLowerCase();

            int [] count = new int[26]; //here have a array with 26 positions

            //lister -> l +1, i +1; s +1
        //silent -> s -1, i -1 etc

        // ab   a +1, b +1      a - 0  b =1   c = 2
        //bc  b -1, c -1        z- 25

           for (int i = 0; i < one.length(); i++) {
               char letterFromOne = one.charAt(i); // a -> 97 - 97  b - 98 ASCIU TABLE z-122 -97 =25
               char letterFromTwo = two.charAt(i);

               count[letterFromOne - 97] = count[letterFromOne - 97] +1;
               count[letterFromTwo - 97] = count[letterFromTwo - 97] -1;
               //How can I make dynamic?

                System.out.println(Arrays.toString(count));
           }

            return Arrays.equals(count, new int[26]);

    }


}
