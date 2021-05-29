package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

class MethodsWithListReturn {
    public static void main(String[] args) {

        //1 nanosecond = 1_000_000_000 of a second
        //System.out.println(System.nanoTime());
        //we need to capture
        long start = System.nanoTime(); // get ending time
        List<Integer> mlnNums = getIntegerList();//returns ready ArrayList object. no need new Arra..
        Long end = System.nanoTime();
        double listSeconds = (end - start) /1_000_000_000.0;
        System.out.println("ArrayList time = " + (end - start));
        System.out.println("ArrayList seconds = " + listSeconds);

        long st = System.nanoTime();
       int[] arr = getIntegerArray(); //I want to store in to Array
        long en = System.nanoTime();
        double seconds = (en -st) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + seconds);

    }
    /**
     * getIntegerList
     * No params
     * return List<Integer>
     *    Loop from 0 - 1000_000
     *    and add to arraylist then return it
     */
    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= 1_000_000; i++) {
            nums.add(i);
        }
        return nums;
    }

    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */
    public static int[] getIntegerArray() {
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        for(int i = 0; i <= 1_000_001; i++) {
            nums[i] = i;
        }
    return nums;
    }
    /**
    * getDays
    */

}
