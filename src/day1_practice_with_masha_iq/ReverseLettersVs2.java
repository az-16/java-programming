package day1_practice_with_masha_iq;

import java.util.Arrays;

public class ReverseLettersVs2 {
    /**
     * reverse letters without affecting specail characters:
     * "Lm,no,p!#
     *
     */
    public static void main(String[] args) {
        System.out.println(reverseNoSpec("Lm,no,p!#"));

    }
public static String reverseNoSpec(String str) {

        char [] letters = str.toCharArray();
    System.out.println(Arrays.toString(letters));

//multiple loops used
    for(int i = 0, j = letters.length-1; i < letters.length/2; i++){

        if(Character.isLetter(letters[i])){

            for(; j >=0; j--){
                if(Character.isLetter(letters[j])){

                    char temp = letters[i];
                    letters[i] = letters[j];
                    letters[j--] = temp;
                    break;
                }
            }

        }
    }




    return String.valueOf(letters);
}

}
