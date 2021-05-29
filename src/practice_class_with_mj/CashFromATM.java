package practice_class_with_mj;

public class CashFromATM {

        /*
        1. sentence = "I have 20 dolaars, and borrow $15 from my friend and also get $85 cash fromm ATM. How much muney do I have?
        2. I need to sum all numbers tohether

        array [2] = 20
        How we do know 2 is num?
        1) we should find 2 or 20 is digit?
        int[] num = Integer.parseInt(20)

        I can say
        character.isDigit('2'); // true  when u want to find isDigit or not u should put into the character Array.
        HOw can I find find 20 is digit or Array?
        What is best to put in to the char Array?

   // char [] characters = sentence.toCharArray();
   reading all character we need for loop

   for (int i = 0; i < characters.length; i++) {

   What is the whole idea to using wrapper class? primitive to objective
            if(Character.isDigit(characters[i])){

         */
        public static void main(String[] args) {
            String sentence = "I $22have+2";
            System.out.println(sumChar(sentence));

    }

    public static int sumChar(String str) {

            String num = "0";
            int sum = 0;

            char [] characters = str.toCharArray();
         for (int i = 0; i < characters.length; i++) {

             //num = ""
             //sum = 0
             //if i == char = I
             //num = I
             if (Character.isDigit(characters[i]) && !Character.isDigit(characters[i+1])){
                 //num = "" + 'I'; //num + I
                 num += characters[i];

             }
             if(i ==characters.length-1 || !Character.isDigit(characters[i+1])) { //+1 is space
                 sum += Integer.parseInt(num); // == sum += Integer.parseInt(I) // bc I is characters How we convert in to the integer
                 num = "0";
             }


         }
            return sum;
    }
}
//num == 20
//sum ==