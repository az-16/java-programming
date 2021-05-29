package day38_methods;

public class ArrayUtils {
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {
        //then we need to calculate
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum; //return should be outside the loop
    }

    public static boolean contains(int[] nums, int num){
        boolean found = false;
        for(int each : nums) {
            if(each == num) {
                found = true;
                break;
            }
        }
        return found;



}
}