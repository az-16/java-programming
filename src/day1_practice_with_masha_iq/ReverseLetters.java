package day1_practice_with_masha_iq;

import java.util.Arrays;

public class ReverseLetters {
    /*
    Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string
in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
copied!
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
Input:   str = "----qwe--r--tyf...gd.---"

Output:  str = "----dgf--y--tre...wq.---"
*/
    public static void main(String[] args) {

       // Scanner in = new Scanner(System.in);
        //System.out.println(reverseNoSpec(in.next()));
        //let's use manually for this task
        System.out.println(reverseNoSpec("Ab,c,de!$"));


    }

    public static String reverseNoSpec(String str) {

        //edcbA (without special characters !$looks like) we can swap it too
        char [] letters = str.toCharArray(); // it will separated every characters    [A, b, ,, c, ,, d, e, !, $]
        System.out.println(Arrays.toString(letters));

        //we can declare multiple variables in one loop
        //purpose of first loop goes to every character in Array
        for(int i = 0, j = letters.length-1; i < letters.length/2; i++){ //increment or decrement j it is not a optional only we need variables j = letters.length-1
        // we will gonna check if character is letter
            if(Character.isLetter(letters[i])){

                // purpose of 2nd loop it will look character from the END
                //I don't need here initialization part. WHy I declare j in first loop why in second loop
                //if u declare j in inner loop (2nd loop) j will be reset goes back to the end
                //if goes to the end it is not checking other characters
                for(; j >=0; j--) { //here this inner loop it will read characters from the END

                    if(Character.isLetter(letters[j])) {

                        char temp = letters[i]; // A here we are storing A in to character
                        letters[i] = letters[j];//e
                        letters[j--] =temp; // A put end e int the beginning here swapped A and e
                        //here we will stop inner loop
                        break;
                    }

                    }



            }



        }

        //return Arrays.toString(letters).replace("[", "").replace("]", "").replace(" ,", ""); //instead of this we can use
        //this one. short and understandable
        return String.valueOf(letters);
    }

}
