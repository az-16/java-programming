package repl_practice_task;
import java.util.Scanner;

import static repl_practice_task.HelloWorldMethod.hello;
import static repl_practice_task.HelloWorldMethod.world;

public class CountLength {
    public static void main(String[] args) {
        hello();
        world();
        /**
         * Write a program that will output length of the text (string).
         *
         * Example:
         *
         * Display message: "Please enter the text:"
         * Display message: "Please enter the text:"
         * input: java
         * input: java
         * Display message: "Length is: 4"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");

        String input = scan.nextLine();
        int count = input.length();
        System.out.println("Length is: " + count);
            //second option
        System.out.println("Length is: " + scan.nextLine().length());

    }


    }

