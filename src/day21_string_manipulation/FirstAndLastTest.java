package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        /**
         * PALINDROME
         */
        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);
       // if (first == last) {
          //  System.out.println("First and last letter match");
       // } else {
            //System.out.println("First and last letters mismatch");
            if (word.charAt(0) == word.charAt(2)){
                System.out.println("First and last letter match");
            }else{
                System.out.println("First and last letters mismatch");
            }
            String friend = "Aziza";
            char firstLetter = friend.charAt(0);
             //HOW DO WE FIND LETTERS WITHOUT COUNTING. OF COURSE we can use length

            int count = friend.length(); // I am getting how many characters
           // count --; instead of putting -1 we can use count --;
           //char lastLetter = friend.charAt(count-1); // from count we -1.
            char lastLetter = friend.charAt(friend.length() -1);
            System.out.println(firstLetter);
            System.out.println(lastLetter);

            if(firstLetter == lastLetter){
                System.out.println(friend + " - first and last letter match");

            }else{
                System.out.println(friend + " - first and last letter mismatch");
            }

//TODO
        }




    }

