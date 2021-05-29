package day12_conditional_statements;

import java.sql.SQLOutput;

public class IfElseStatment {
    public static void main(String[] args) {
        if( 10 > 5){
            System.out.println("CONDITION IS TRUE");

        }else{
            System.out.println("CONDITION IS FALSE");
        }

        int count =25;
        //check if count is more than 30. If yes, print "count is more than 30"
        //otherwise print "count is less than 30'

        if(count > 30){   //false. if falls condition will jump line 19
            System.out.println("count is more than 30");
            } else{
            System.out.println("count is less than 30"); //here
        }
        //ex.for voting
         byte age = 25; // can we compare this one?
        if( age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println(" Not Eligible to vote");
            System.out.println(" Age is less then 18");
        }

    }

}
