package java_my_practice;

public class StringNestedLoop {
    public static void main(String[] args) {

        /**
         * find duplicates and count
         * find unique characters(appearing only once)
         * print character and number of occurences
         */
        String word = "java";
        for(int i = 0; i <= word.length()-1; i++){
            for(int j = 0; j<= i; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();

            }





            /**
             * * java
             *   ava
             *   va
             *     a
             *   OUTER: 0 - word.length()
             * NNER : OUTER - word.length()
             */
        for(int i = 0; i <= word.length(); i++){
            for(int j = i; j <= word.length(); j++){
                System.out.print(word.charAt(j));
            }
            System.out.println(); // new line after inner loop
        }


    }

    }

