package day11_comprason_operators;

import javax.sound.midi.Soundbank;

public class PrePostInscrementDecrementOperators {
    public static void main(String[] args) {
        // pre inscrement ++ (increase by 1)
        int num1 = 10;
        int num2 = ++ num1;
        System.out.println( "num1 = " + num1);
        System.out.println( "num2 = " + num2);

        //post increment

        int num3 =4;
        int num4 = num3;
        num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;

        System.out.println("a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);

        int apples = 40;
        int basket = ++apples;
        System.out.println("apples = " + apples); // here apple increase first assigned to back basket. 41 will put to basket. both 41
        System.out.println("basket = " + basket);

        int kiwi = 7;
        int kiwiBasket =kiwi++; //increased first
        System.out.println("kiwi = " + kiwi); //here 7 assigned to basket first, after assigned// 8
        System.out.println("kiwiBasket = " + kiwiBasket);// 7

        int cars = 10;
        System.out.println( ++cars);
        int sedans= 7;
        System.out.println(sedans++);
        System.out.println(sedans);//here increasing

    }
}
