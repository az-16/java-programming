package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>(); //this is polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(34); nums.add(44); nums.add(3); nums.add(3);
        nums.add(7); nums.add(15); nums.add(6); nums.add(58);
        nums.add(7); nums.add(15); nums.add(6); nums.add(58);
        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);

        //nums.remove(88); -> index 88 -> indexOutOfBoundException


        //for loop - iterate through all values and print
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
        // for each loop, and print all in same line
        for( int n: nums){
            System.out.println(n +" ");   // methods belongs to object
        }

    }
}
