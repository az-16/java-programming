package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {2, 78, 99, 777, 15};
        ArrayUtils.printArray(nums); //this is void printing for me
        ArrayUtils.printArray(new int[]{23, 67, 23, 456, 783, 222, 56, 89}); //we can do in one line too

        System.out.println("sum = " + ArrayUtils.sum(nums)); //this is not void so i have to print
        System.out.println("sum = " + ArrayUtils.sum(new int[]{23, 67, 23, 456, 783, 222, 56, 89}));
                        //0  1  2   3  4
        int[] nums2 = {4, 1, 5, 4, 3};
        int num = 5;
        boolean found = false;

        for (int each : nums) {
            if (each == num) {
                found = true;
                break;
            }
        }
        System.out.println("found = " + found);
    }

    public static void contains(int[] nums, int num) {
        boolean found = false;
        for (int each : nums) {
            if (each == num) {
                found = true;
                break;

            }
        }

        int[] nums2 = {4,2, 5, 4, 7, 8};
        System.out.println("5 - found = " + ArrayUtils.contains(nums2, 5));
        System.out.println("8 - found = " + ArrayUtils.contains(nums2, 7));

    }


}