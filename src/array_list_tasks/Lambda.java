package array_list_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
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



        //List<Character> list3 = new ArrayList<>();
        String str = "ABC9D123$%#@&456EFG!";
        List<Character> strList = new ArrayList<>();
        for(Character ch : str.toCharArray()) {
            strList.add(ch);
        }
        List<Character> list1 = strList.stream().filter(findExpression->!Character.isLetterOrDigit(findExpression)).collect(Collectors.toList());
        System.out.println("Test: " + list1);
        List<Character> list2 = strList.stream().filter(findLetter->Character.isLetter(findLetter)).collect(Collectors.toList());
        System.out.println("Test: " + list2);
        List<Character> list3 = strList.stream().filter( findNumber-> Character.isDigit(findNumber)).collect(Collectors.toList());
        System.out.println("Test: " + list3);


    }
}
