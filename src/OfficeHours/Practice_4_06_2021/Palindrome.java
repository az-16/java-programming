package OfficeHours.Practice_4_06_2021;

public class Palindrome {
    public static void main(String[] args) {
         //if a nn a= first character and last character are equal, and n eq.to n = they are palindrom
        //anna
        //civic  even or odd doesn't matter on Palindrom   middle v does not check
        //  2.think     about ACTION WE GONNA TAKE
        //3. using by if condition we will check (anna) first and last charaters are match.
        //4.    how we read a last character? word.charAt(word.length()-1))
        // dividing by 2 check palindrom, but 2 is not necessary
        // n != a; when we adding -i it will gonna give us n.

        String word = "civic"; //anna
        boolean isPalindrome = true; //make sure default is true
        //Q: what if your String has a million characters?
        for(int i=0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                // Now there are matching n != n. No it is false;
                isPalindrome = false;
                break;

            }

        }
        System.out.println(isPalindrome);
    }
}
