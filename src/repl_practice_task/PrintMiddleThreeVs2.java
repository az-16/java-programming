package repl_practice_task;

import java.util.Scanner;

public class PrintMiddleThreeVs2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int startIndex = word.length()/2-1;
        int endingIndex = word.length()/2+2;

        if(word.length()%2 == 0 && word.length() > 5){
            System.out.println(word.substring(startIndex, endingIndex));
        }else{
            System.out.println("Invalid");
        }
    }
}
