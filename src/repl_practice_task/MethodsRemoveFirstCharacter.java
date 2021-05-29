package repl_practice_task;

import java.util.Scanner;

public class MethodsRemoveFirstCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(word(in.nextLine()));
    }
    public static String word(String target){
        return target.substring(1);
    }
}
