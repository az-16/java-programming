package day10_shorthand_operators;

import javax.sound.midi.Soundbank;

public class ChangeVariableValue {
    public static void main(String[] args){
        int count = 3;
        System.out.println("count = " + count);
        //add/increase count by 2
        count = count + 2;
        System.out.println("count = " + count);


        int potatoes = 20;
        System.out.println("POtatoes = " + potatoes);
        //increase by  7
        potatoes = potatoes + 7;
        System.out.println("Potatoes = " + potatoes);
       //decrease by 18
        potatoes = potatoes - 18;
        System.out.println("Potatoes = " + potatoes);

        int pizzaSlices = 12;
        System.out.println("Pizzaslices = " + pizzaSlices);
        //half pizza done 6
        pizzaSlices = pizzaSlices / 6;
        System.out.println("PizzaSlices = " + pizzaSlices);

        //get another whole small pizza just for u 4 slices
        pizzaSlices = pizzaSlices + 4;
        System.out.println("PizzaSlices = " + pizzaSlices);

        int cents  = 200;
        System.out.println("Cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("Remaining cents = " + cents);


    }
}
