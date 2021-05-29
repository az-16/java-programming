package day16_switch_ternary;

import javax.sound.midi.Soundbank;

public class CappuccinoBuyer2 {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0.0;
        int calories = 0;
       // if(size.equals ("tall")){
            switch (size){
                case "tall":
                    System.out.println("Tall Cappuccino please");
                    price = 3.69;
                    calories = 90;
               // break;
                case("grande"):
                    System.out.println("Grande Cappuccino please");
                    price = 3.99;
                    calories = 120;
                    //break;
                case("venti"):
                    System.out.println("Vento Cappuccino please");
                    price = 4.29;
                    calories = 150;
                    break;
                default:
                    System.out.println("We don't serve that size of Cappuccino");
                    break;
            }
            System.out.println("Total price: $" + price);
            System.out.println( "You will consume " + calories + " cal of energy");
        }
    }

