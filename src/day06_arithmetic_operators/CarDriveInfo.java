package day06_arithmetic_operators;

public class CarDriveInfo {
    public static void main(String[] args){

//        String carModel;
//        carModel = "BMV x5";
        String carModel = "Dodge charger";
        String driverName = "Donald Trump";
        String lisenceNumber = "LetsMakeJavaGreatAgain12345";
        short speed = 55;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        //Dodge charger is car model.
        System.out.println("Car model : "+ carModel);
        System.out.println(carModel + " is car model");
        System.out.println("driverName:" + driverName  );
        System.out.println(driverName);
        System.out.println(driverName + " is driving the car");
        System.out.println(driverName + " is driving " + carModel);
        System.out.println("Current speed is " + speed);
        //Current speed is: 55mph
        System.out.println("Current speed : " + speed + " mph");
        System.out.println("Is car automatic -> " + isAutomatic);
        System.out.println(licenseClass+" - "+isAutomatic);



  }
}
