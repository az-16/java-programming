package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car(); //new keyboard

        //error below, model and year are PRIVATE and cannot be access
        // car1.model = "Nissan Altima";
       // car1.year = 2021;
        car1.setModel("Nissan Altima");
        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(27377);
        System.out.println("car1 mileage = " +car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1); //automatically calls toString

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16789);

        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);

    }
}
