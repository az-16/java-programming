package day18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        /*
        Make => Mercedes
    Model =>  E
        leasePrice = 500
    Model => A
        leasePrice = 400

Make => Audi
    Model =>  SQ5
        leasePrice = 552
    Model => A3
        leasePrice = 412
You do not have permission to send messages in this channel.

         */

        String make = "Mercedes";
        String carModel = "A";
        double leasPrice = 0.0;

//         if( make.equals("Mersedes") && carModel.equals("E")) {
//            leasPrice = 500;
//       }else if (make.equals ("Mersedes") && carModel.equals("A")){
//          leasPrice = 400;

        if (make.equals("Mersedes")) {
            if (carModel.equals("E")) {
                leasPrice = 500;
            } else if (carModel.equals("A")) {
                leasPrice = 400;

            }
        }else{
            System.out.println("Invalid make");
            return; // exit program/ exit main method
        }
        System.out.println("make = " + make);
        System.out.println("Car model = " + carModel);
        System.out.println("leasPrice = " + leasPrice);
    }

    }



