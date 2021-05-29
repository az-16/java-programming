package day33_arrays;
import java.util.*;
public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " +num1);
        System.out.println("num2 = " + num2);
        //swap (meniyat) those using additional variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " +num1);
        System.out.println("num2 = " + num2);

        int[] nums = {5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;

        System.out.println("After: " +Arrays.toString(nums));
                //     0  1   2   3
        int[] nums2 = {6, 2, 9, 100};
        System.out.println("Before: " + Arrays.toString(nums2));
                            //2 we are reversing until the middle
        for(int i = 0; i < nums2.length/2; i++){ //in order to count everything we divide by/2
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length-1-i];
            nums2[nums2.length-1-i] = temp2;



        }
        System.out.println("After swap: " +Arrays.toString(nums2));



    }


}
