package day17_ternery_nested_conditions;

import javax.sound.midi.Soundbank;

public class VendingNestedIf {
    public static void main(String[] args) {
        /*
        selection = "drink" orr can be "snack"
drink = "tea" , "coke"
snack = "chips" , "candy"

when selection is "drink":
    "drink option is selected"

    when drink is "tea":
        "tea is selected"
    when drink is "coke":
        "coke is selected"
when selection is "snack"
    "snack option is selected"

    when snack is "chips":
        "chips item is selected"
    when snack is "candy":
        "candy item is selected"

         */
   String selection = "drink"; //snack
   String drinkItem = "coke"; // tea
   String snackItem = "chips"; // candy


   if (selection.equals("drink")) {
       System.out.println("Drink option is selected");

       if(drinkItem.equals("coke")) {
           System.out.println("Coke is selected");
       }else{
               System.out.println("Tea is selected");
           }
       }else if(selection.equals("snack")){
       System.out.println("Snack option is selected");
       if (snackItem.equals("chips")){
           System.out.println("Chips item is selected");

       }else{
           System.out.println("Candy option is selected");
       }

   }

   }






    }

