package day53_inheritance.tesla;

public class Roadster extends ElectricCar{
    //Roadster r = new Roadster("Roadster", 200000, 2022, 620);
    public Roadster(String model, double price, int year, int range) { //here we deleted make.
          //super always needs to be first statemenet
        //"Tesla","Roadster",200000, 2022, 620     // Inside super we wrote it just Tesla b/c value is hard coded
        super("Tesla", model, price, year, range); //super -> calling parent class constructor
        System.out.println("Welcome to new Roadster!"); //
    }
}
