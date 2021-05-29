package repl_practice_task;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        /*
        Separate Parts (Went through in office hours)Write a program that can extract the special characters,
        digits and letters from a string and stores them into separate ArrayLists of Characters
        Ex:

        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}
         Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the
         other ArrayListsChallenge
         2: do the original task again, but without a loop. Use lambda
         */
    //regex
        //we have to visit all the characters

      //  List<Character> list1 = new ArrayList<>();
       // List<Character> list2 = new ArrayList<>();
       // List<Character> list3 = new ArrayList<>();

       String  str = "ABCD123$%#@&456EFG!";
        //Character[] arr = {'A', 'B'}
       for(Character ch : str.toCharArray()) {
            System.out.println(ch);
            if(Character.isDigit(ch)) {
                System.out.println(" - is a digit. \n");
            }else if(Character.isLetter(ch)) {
                  //  list2.add(ch);
            }else {
                //list1.add(ch);
            }

        }
        System.out.println();


    }
}
