package day26_Loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "java";       //"today is java class and we are coding for loops";
//    // we gonna do dinymic way. for loop
//        for(int i = 0; i < word.length(); i++){
//            System.out.println(word.charAt(i));

        /**
         * print word letters in reverse
         */
//        word = "java";    //we can allways change the word
//        for (int i1 = 3; i1 >= 0; i1--) {
//            System.out.println(word.charAt(i1));

            word = "Aizat";
            for (int i = word.length()-1; i >= 0; i--) {
                System.out.print(word.charAt(i));

            }

        }


        // System.out.println(word.length());

        /**
         * IT WAS LONG WAY WITHOUT LOOP
         * System.out.println(word.charAt(0));
         System.out.println((word.charAt(1)));
         System.out.println(word.charAt(2));
         System.out.println(word.charAt(3));
         System.out.println(word.charAt(4)): ERROR
         //what happened if I put 4? it will outOfBounds*/

    }
