package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        /*
        add main method
Car dealership:
budget = 5000
model -> "Toyota" , add main method
Car dealership:
budget = 5000
model -> "Toyota" , "Honda" ,"Tesla"
carPrice = 4500
using If condition with logical operators, decide if you would like
to purchase the car.
1 - needs to be within budget
    AND
2 - needs to be "Toyota" OR "Honda" OR "Tesla"
in Boolean operators:
&& is evaluated first, then || is evaluated.
If we use paranthesis, then the boolean expression in paranthesis is evaluated first.
*/
  int budget = 5000;
  String model = "Honda"; //"Honda" ,"Tesla"
   double carPrice = 3500;
   if(carPrice <= budget && (model.equals("Toyota ")) || (model.equals("Honda "))) {
       System.out.println("Car models for purchase = " + model +  " , price = " + carPrice);
   }else{
       System.out.println(" Not interested in model = " + model + " , price = " + carPrice);


   }
    }
}
