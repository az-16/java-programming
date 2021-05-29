package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vws = 2;
        int teslas = 20;
        int nissans = 1;
        int bmv = 155;

        // int toyatas = 431, hondas = 233, vws = 2, teslas = 20,nissans = 1, bmv = 155;
        // There are 842 cars in parking lot

        int totalCarsInparking = toyotas + hondas + vws + teslas + nissans + bmv;
        System.out.println("There are " + totalCarsInparking + " cars in parking lot");


        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        //there are 2 slices per person;
         System.out.println("Tere are " + slicesPerPerson + " slices per person");
         //We oredered hawaiian pizza with 8 slices, 4 people ate 2 slices ech.
        System.out.println("We ordered " + pizza + " pizza  with " + slices + " slices, " + people + " people ate " + slicesPerPerson + " slices each");



    }
}
