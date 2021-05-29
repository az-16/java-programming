package day42_arrayList;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        for(int each : nums){
            System.out.print(each +" ");
        }
    }
}
