package day31_arrays;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 1, 7,0, -4, 44, 33};
        //print aal nums in same line
        System.out.println(Arrays.toString(nums));

        //sort nums change array value
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("maax value: " + nums[nums.length-1]);
        //Arrays.sort(nums, Coolections.reverseOrder());

        String[] words = {"java", "C#", "C++", "Kotlin", };
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");

        //sort words in alpabetic and AsCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));



    }
}
