package day28_loops;

import org.w3c.dom.ls.LSOutput;

public class FindUniqueChars {
    public static void main(String[] args) {
       /**
         * given a string retrieve
         */

        String word = "javva";
        String unique = "";

        for(int i = 0; i < word.length(); i++){
           // if word.charAt(i) is not contains in unique
            // add to unique
            //System.out.println(word.charAt(i))
           if(!unique.contains(word.charAt(i)+""));
            unique += word.charAt(i);
        }
        System.out.println(unique);
    }
}
