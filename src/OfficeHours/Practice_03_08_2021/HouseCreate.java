package OfficeHours.Practice_03_08_2021;

public class HouseCreate {
    public static void main(String[] args) {
/*
1) Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
        String houseType = "Single House";
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchen = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = false;
        boolean isThereAPool = false;
        boolean isTheHouseForSale = true;
        double costOfTheHouse = 394.900;
        String address = ("5325 S Jessica Ct, New Berlin");
        int zipCode = 53151;
        boolean isAParkNearBy = true;
        String ratingOfSurroundingSchoolDistricts = "****";

        System.out.println("House type: \t\t\t"  + houseType);
        System.out.println("Number of bedrooms: \t" + numberOfBedrooms);
        System.out.println("Number of bathrooms: \t" + numberOfBathrooms);
        System.out.println("Number of kitchen: \t\t"  + numberOfKitchen);
        System.out.println("Is there a basement?: \t" + isThereABasement);
        System.out.println("Is there an attic?: \t" + isThereAnAttic);
        System.out.println("Is there a pool: \t\t" + isThereAPool);
        System.out.println("Is the house for sale?: " + isTheHouseForSale);
        System.out.println("Cost of the house: \t\t" + costOfTheHouse);
        System.out.println("Address: \t\t\t\t" +  address);
        System.out.println("Zip code: \t\t\t\t" + zipCode);
        System.out.println("Is a park near by?: \t" + isAParkNearBy);
        System.out.println("Rating of surrounding school districts:" + ratingOfSurroundingSchoolDistricts);



    }
}

