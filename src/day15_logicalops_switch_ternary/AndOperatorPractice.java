package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String [] args) {
/*
add new package day15_logicalops_switch_ternary
add new class AndOperatorPractice
main method

onSale, freeShipping
itemName

use if statement with && , to check if you would add item in cart.
 */
        boolean onSale = true;
        boolean freeShipping = false;
        String itemName = "Wooden Spoon";
        if (onSale && freeShipping){ // we can do: onSale == true && freeShipping == true - like that BUT ITS ALREADY BOOLEAN!
        System.out.println("Adding to cart " + itemName);
    }else{
            System.out.println("Continue shopping for good deals on-" + itemName);
        }
//add to cart only when it is freeShipping, onSale and itemName is "Wooden Spoon"
        //  we are combined here
        if(freeShipping && onSale && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to cart= " + itemName);
        }else{
            System.out.println("Continue shopping for good deals on = " + itemName);
        }



    }
}
