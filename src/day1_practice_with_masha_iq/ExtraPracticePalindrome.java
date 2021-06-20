package day1_practice_with_masha_iq;

public class ExtraPracticePalindrome {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int reversedNum = 0;
        int lastDigit = 0;

        while(temp != 0){
            lastDigit = temp %10;
            reversedNum = reversedNum *10 + lastDigit;
                            // 0 *10 + 1= 1
                            // 1 * 10 + 2= 12
            temp = temp/10;
            // 12321 //last digit will dissapiered
            // 1232
            // 123
            // 12
            //1
        }
        System.out.println(num == reversedNum);
    }


}
