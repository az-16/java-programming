package day33_arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {

      //              0   1   2   3
        int[] nums = {5, 10, 4, 100};
        int[] numsRev = new int[nums.length]; //{0 0 0 0 }
        //I need to reverse
        // i = 3, j = 0
        for(int i = nums.length-1,  j = 0; i >= 0; i--, j++) {
            numsRev[j] = nums[i];

        }
        System.out.println(Arrays.toString(nums)); // Arrays.toString helps to print same line
        System.out.println(Arrays.toString(numsRev));

    }
}
