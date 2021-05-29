package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
       System.out.println("###### WELCOME TO ADAIRE APARTMENTS ########");
       int numberOfBedrooms = 6;
        double startingPrice = 0;
        /*

add new class AdaireApartments
main method
#### WELCOME TO ADAIRE APARTMENTS ####
numberOfBedrooms = 0, 1, 2
startingPrice = 0;
when numberOfBedrooms 0:
    print: "Studio apartment selected"
    startingPrice -> 1454
when numberOfBedrooms 1:
    print: "One bedroom apartment selected"
    startingPrice -> 1725
when numberOfBedrooms 2:
    print: "Two bedroom apartment selected"
    startingPrice -> 2899


         */

       // if (numberOfBedrooms == 0) {    //THIS WAS MULTI BRANCH STATEMENTS
       //     System.out.printf("Studio apartment selected");
        //    startingPrice = 1500.0;
       // }else if (numberOfBedrooms == 1){
        //    System.out.println("One studio apartment selected");
         //   startingPrice = 1800;


        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1560.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1750.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 1970.0;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom currently unavailable");
                break;

        }
        System.out.println("Starting price: $" + startingPrice);

    }
    }

