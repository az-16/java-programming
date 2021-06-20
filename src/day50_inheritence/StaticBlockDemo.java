package day50_inheritence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {

    public static class Inner{
        //variables and methods of inner static class

    }
    //lets add variable

    static int num; //what is num? num is null by defoult
    static List<String> carModels;
    static{ //static class runs one time only we doing anything

        System.out.println("static initializer block");
        num = 10; //it was 0 we made 10
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Abarth",
                "Alfa Romeo",
                "Aston Martin",
                "Audi",
                "Bentley",
                "BMW",
                "Bugatti",
                "Cadillac",
                "Chevrolet",
                "Chrysler",
                "Citroën",
                "Dacia",
                "Daewoo",
                "Daihatsu",
                "Dodge",
                "Donkervoort",
                "DS",
                "Ferrari",
                "Fiat",
                "Fisker",
                "Ford",
                "Honda",
                "Hummer",
                "Hyundai",
                "Infiniti",
                "Iveco",
                "Jaguar",
                "Jeep",
                "Kia",
                "KTM",
                "Lada",
                "Lamborghini",
                "Lancia",
                "Land Rover",
                "Landwind",
                "Lexus",
                "Lotus",
                "Maserati",
                "Maybach",
                "Mazda",
                "McLaren",
                "Mercedes-Benz",
                "MG",
                "Mini",
                "Mitsubishi",
                "Morgan",
                "Nissan",
                "Opel",
                "Peugeot",
                "Porsche",
                "Renault",
                "Rolls-Royce",
                "Rover",
                "Saab",
                "Seat",
                "Skoda",
                "Smart",
                "SsangYong",
                "Subaru",
                "Suzuki",
                "Tesla",
                "Toyota",
                "Volkswagen",
                "Volvo"));
    }

   //here u don't type static / just by itself
   // curly braces itself initializer block -> runs each time object created, before constructor
    {
        System.out.println("Initializer block");

    }

    public StaticBlockDemo() {
        System.out.println("Constructor method");
        num += 5;
    }

    public StaticBlockDemo(int value) {
        System.out.println("Overloaded constructor - value = " + value);
        num += value;
    }





    //other methods that use the carModels arraylist

}
