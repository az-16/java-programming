package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326); //here we are calling the constructor//object is real thing is been created in comp memory
        ec1.drive(50); //how long u want to drive
        System.out.println(ec1.toString());
        //System.out.println(ec1.make);

        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());
        System.out.println("ec1 price = " + ec1.getPrice());

        if(ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() +" - "+ec1.getModel() +" is out of my budget");
        }else{
            System.out.println("purchasing " + ec1.toString());
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", "CyberTruck", 59900, 2022, 300);
        System.out.println(ec2.toString()); // call static method using Classname
        System.out.println("Count = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount()); //static method is also inherited

        ModelX myModelX = new ModelX("Tesla", "Model X", 89990.0, 2021, 360);
        System.out.println(myModelX.toString());
        myModelX.drive(10);
        System.out.println("Having lunch");
        myModelX.drive(10);
        System.out.println("Range remaining");


    }
}
