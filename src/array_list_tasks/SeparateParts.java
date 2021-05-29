package array_list_tasks;

import java.util.ArrayList;
import java.util.List;

public class SeparateParts {

        /**
         * Separate Parts (Went through in office hours)Write a program that can extract the special characters,
         * digits and letters from a string and stores them into separate ArrayLists of Characters
         * Ex: str = "ABCD123$%#@&456EFG!"
         * list1: {$, %, #, @, &, !}
         * list2: {A, B, C, D, E, F, G}
         * list3: {1, 2, 3, 4, 5, 6}
         * Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the
         * other ArrayListsChallenge 2: do the original task again, but without a loop. Use lambda
         */
        public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();

        String str = "ABCD123$%#@&456EFG!";
        for(Character each : str.toCharArray()) {
            if(Character.isDigit(each)) {
                list3.add(each);
            }else if(Character.isLetter(each)) {
                list2.add(each);
            }else {
                list1.add(each);
            }
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);



    }
}
