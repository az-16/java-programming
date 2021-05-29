package java_my_practice;

public class ArrayIntro {
    public static void main(String[] args) {
        int num = 10; // single variable // we can assign like this
       //array variable this is longest way
        int[] nums = new int[3]; // array variable
        nums[0] = 4;
        nums[1] = 7;
        nums[2] = 8;
       // nums[3] = 100; //ArrayIndexOutOfBoundsException
        //print value of array
        System.out.println("value at index 0 = " + nums[0]); //index 0
        System.out.println("value at index 1 = " + nums[1]); //index 7
        System.out.println("value at index 2 = " + nums[2]); //8

       // we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]); //7

        // how to find out size of the array
        System.out.println("number of elements = " + nums.length);

        //store length of array into len variable;
        int len = nums.length;
        System.out.println("len = " + len);
        //change values in the array
        nums[0] = 100;
        nums[1] = 300;
        //read the value of index 1 and assign same to index 2;
        nums[2] = nums[1];

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);
    }
}
