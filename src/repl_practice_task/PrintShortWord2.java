package repl_practice_task;

import java.util.*;

public class PrintShortWord2 {
    public static void main(String[] args) {

        /** Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.
         *
         * Hint: Split values by comma: split(", ");
         *
         * input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
         *
         * output: [cat, old, ray]
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        String[] strArr = str.split(",");
        System.out.println(Arrays.toString(strArr));
        String [] shortest ={strArr[0]};

        for(String each : strArr){
            //if




}
    }
    }
