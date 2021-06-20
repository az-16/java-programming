package day1_practice_with_masha_iq;

public class PalindromeReverse2 {
    public static void main(String[] args) {

        /**
         A Palindrome is a sequence of words, digits or other symbols that reads the same both
         forwards and backwards.
         */

        int num = 12321;
        int temp = num;
        int reversedNum = 0;
        int lastDigit = 0;// 11%2 = 2+2+2+2+2+1=1 ==> 1 is remainder

        //LOOP
        //We need loop to process it so it will check each number

        while(temp != 0) {

        //1.
        //find the last number of the num, via ->(через) math we can check by the remainder. If we will 12345/10 = 1234,5. =>
        //12345%10 = 5
        // 1234%10 = 4
        lastDigit = temp % 10;
        System.out.println("LastDigit = " + lastDigit); //1

        //2. second we are reversing
        //Since this is not a String we can not just add remainder,
        //because it will add it and give sum... so we will do via math way

        //0                  // 0 *10      + 1
        reversedNum = reversedNum * 10 + lastDigit; //this way we will add number without changing the value
       // 12321 we have to reverse this
        //reversedNum = 0 *10 + 1 = 0+1=1;
        // 1 *10 +2 = 12;
        //12*10 + 3 = 120+3=123;
        //123*10 + 2 = 1230+2= 1232
        //1232*10 + 1 = 12320 +1 = 12321;
            System.out.println("lastDigit = " + lastDigit);

         temp = temp/10;
       System.out.println("temp = " + temp);

       // now  with if condition we need reverse number is equal to the original number
            if(reversedNum == num) {
                System.out.println("Number is Palindrome");
            }else{
                System.out.println("Number is not palindrome");
            }







        }
    }
}