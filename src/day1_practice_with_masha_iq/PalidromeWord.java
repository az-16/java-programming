package day1_practice_with_masha_iq;

public class PalidromeWord {
    public static void main(String[] args) {
        String word = "masha";
        boolean isPalindrome = true;

        for(int i  = 0, j = word.length()-1; i < word.length()/2; i++, j--){  // j last index will give last to first
            if(word.charAt(i) == word.charAt(j)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
            }

        }
        System.out.println("word = " +word + " " + isPalindrome);

    }
}
