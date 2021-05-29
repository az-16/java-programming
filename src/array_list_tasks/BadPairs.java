package array_list_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BadPairs {
    public static void main(String[] args) {
        /**
         * Remove Bad PairsThis method will accept an Integer ArrayList and check for bad pairs. A pair is an element and
         * the element next to it. A bad pair is whenever the first number in the pair is bigger then thesecond number.
         * Remove any bad pairs for the ArrayList and return theArrayList with no bad pairsNote: The given ArrayList will
         * always be an even amountof numbers so each number always has one pair@param nums-Given ArrayList of
         * numbers@return -ArrayList of numbers
         * Ex: Input: {3, 4, 6, 1, 1, 10, 8, 7};Output: {3, 4, 1, 10};Bad pairs that were removed: 6, 18, 7
         */
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 4, 2, 3));
        System.out.println("nums = " +nums);
        nums.add(7);
        System.out.println(nums.add(7));
        //
        nums.add(3, 6);
        System.out.println("nums = " + nums);
        nums.add(1, 10);
        System.out.println("nums = " + nums);
        //
        nums.get(5);
        System.out.println(nums.get(5));
        //
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        nums1.remove(1);
        System.out.println("nums1 = " + nums1); //removed 1
        System.out.println(nums1.remove(3)); //returning the value
        System.out.println("nums1 = " + nums1); //then remove it

        //
        //remove(value)
        nums1.remove("3"); //return boolean
        System.out.println(nums1.remove("3"));

        //
        List<String> words = new ArrayList<>(Arrays.asList("pen", "book", "laptop"));
        words.remove(2); //will remove whatever is inside
        System.out.println("words = " + words);
        words.remove("pen");
        System.out.println("words = " + words); //removes specific objects
        words.remove("book");
        System.out.println("words = " + words);

        List<String> words2 = new ArrayList<>(Arrays.asList("mj" , "mohammad" , "javad" , "semati"));
        System.out.println("words2 = " + words2);
        words2.removeAll(words2);
        System.out.println("words2 = " + words2);

        }
    }


