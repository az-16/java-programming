package OfficeHours.Practice_04_12_2021;

public class EvenAndOddFromArray {
    /**
     * Even and odd from arrayWrite a program that can count the even
     * and odd number from an array of integers
     * UseforeachtomakeiteasierEx:
     * Input:[4,1,3,12,5]
     * Output:
     * Even:2
     * Odd: 3
     */
    public static void main(String[] args) {

   int [] nums = {4,1,3,12,5};
   int even = 0;
   int odd = 0;

   for(int eachNum : nums) {
       if(eachNum % 2 ==0) {   // checking odd: eachNum % 2 != 0  or  eachNum % 2 ==1
           even++;
       }else{
           odd++;
       }
   }
      int [] evenNumbers = new int[even];
      int [] oddNumbers = new int[odd];



        System.out.println("Even: " + even);
        System.out.println("Even: " + odd);
    }


}
