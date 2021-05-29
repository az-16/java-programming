package day33_arrays;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
                    //      0       1         2        3      4
        String[] words = {"java", "python", "html", "ruby", "css"};
        System.out.println("Bfore reverse words: " + Arrays.toString(words));
      //   i - 0; j - 4;                                2
        for(int i = 0, j = words.length-1; i< words.length/2; i++, j--){
            //here we need additional variable
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }

        System.out.println("Words after reverse: " + Arrays.toString(words));

    }
}
