package array_list_tasks;

import java.util.ArrayList;
import java.util.List;

public class SeparatePVS2 {
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();

        String str = "ABCD123$%#@&456EFG!";
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
            if(Character.isDigit(str.charAt(i))) {
                list3.add(str.charAt(i));
            }else if(Character.isLetter(str.charAt(i))) {
                list2.add(str.charAt(i));
            }else {
                list1.add(str.charAt(i));
            }
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
