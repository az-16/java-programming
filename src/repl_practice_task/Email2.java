package repl_practice_task;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {

        /**
         * Write a program that will print out information about user based on email. Print first name, last name, and
         * domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
         *
         * Example:
         *
         * Input: craig_federighi@apple.com
         * Input: craig_federighi@apple.com
         * Output:
         * First name: Craig
         * Last name: Federighi
         * Domain: apple
         */
       Scanner scan  = new Scanner(System.in);
       String email = scan.next();
       String firstName, lastName;

       int underScoreIndex = email.indexOf("_");
       int  domainIndex = email.indexOf("@");
       int dot = email.indexOf(".");

       firstName = email.substring(0, underScoreIndex);
       firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        System.out.println("First name: " + firstName);

       lastName = email.substring(underScoreIndex+1, domainIndex);
       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println("Last name: " + lastName);

       String com = email.substring(domainIndex +1, dot);
         com =  com.substring(0,1)+ com.substring(1);
        System.out.println("Domain: " + com);







    }
}
