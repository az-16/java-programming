package OfficeHours.Practice_4_06_2021;
public class LongestSubstring {
    public static void main(String[] args) {

    /*
    Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print it.
    Ex: aaaabbbbbcccccddddeeee  Output: ccccc
     */
    /*
    1) we have to biggest substring next to each other.
    2) print substring character long
    declare string
    declare longest string
    use loop
    declare one variable temp
    aaadddhjkh- we call iteration

    WHEN WE NEED TO TAKE ACTION? -when characters no match
            "aabbccccc";
     temp+=str.charAt(i); - first we gonna store aa. We need take action when characters is not the same. //bb
        we gonna set next if

     */  //indexOf    012345678
        String str = "aabbccccc";
        //length()    123456789
        String longestSentence = "";
        String temp = "";

        for (int i = 0; i < str.length() - 1; i++){ //max value of i will be 7
            temp+=str.charAt(i); //here I takes every each character and store in to our variable temp
            if(str.charAt(i) != str.charAt(i +1) || i ==str.length()-2){// here manupulation char adding +1. Why we put -2 your loop will stop printing
                if(i == str.length()-2 && str.charAt(i)==str.charAt(i+1)){
                    temp += str.charAt(i+1);
                }
                if(temp.length() > longestSentence.length()) {
                    longestSentence = temp;
                }
                temp ="";
            }

        }
        System.out.println("Longest substring: " + longestSentence);

        }
    }
