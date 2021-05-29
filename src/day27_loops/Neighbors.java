package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        /**
         * String word = "jaaavvaavvppppgggrrrr";
         *
         * if 2 side by side characters match: signal beep - a
         * aa -> beep - a
         * vv -> beep - v
         * aa -> beep - a
          */
        //             01234567891011
        String word = "jaaavva spoonn";
        for(int indexLetter = 0; indexLetter < word.length()-1; indexLetter++){
            System.out.print(word.charAt(indexLetter));
            System.out.println(word.charAt(indexLetter+1));
            if (word.charAt(indexLetter)==word.charAt(indexLetter+1)){
                System.out.println("beep - " + word.charAt(indexLetter));
            }
        }
    }
}
