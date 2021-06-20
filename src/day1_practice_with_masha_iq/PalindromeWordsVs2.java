package day1_practice_with_masha_iq;

public class PalindromeWordsVs2 {
    public static void main(String[] args) {

        //Reverse Palindrome word

        String palWord = "civic";
        boolean isPalindrome = true;

        //we will use multiple for loop
        // here i will read characters until half
        // j will read from the end
        for(int i = 0, j = palWord.length()-1; i < palWord.length()/2; i++, j--) {
            //via if statement we will check the equals of palWord (i and j)
            //charAt to read every character
            if(palWord.charAt(i) == palWord.charAt(j)){
                //here set up boolean condition that declared line 9
                isPalindrome = true;
            }else{
                isPalindrome = false;
            }
        }
        System.out.println("palWord is " + palWord + " " + isPalindrome);
    }
}