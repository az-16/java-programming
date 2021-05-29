package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        List<String> myCars = new ArrayList<>();
        //addCars to myCars
        myCars.add("mazda");
        myCars.add("toyota");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        // jeep, lada, yugo, touota, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString(); //how we store(convert)  all cars in to one(single) String

        System.out.println("allCarsIn1St = " + allCarsIn1St);
         //I want to change the jeep to something else
        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars.toString()); //

        //change index 4 to honda
        myCars.set(4, "Honda");
        System.out.println("After set = " +myCars.toString());

        /**
         * How would you do that if myCars was array:
         * myCars[4] = "Honda";
         */
       
       /** String str = "java":
        str.indexOf("v") == 2
        */
        //find the index number of "ford"
        System.out.println("index of ford = " +myCars.indexOf("ford"));
        //we can store in to variable
       int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        // upgrading moskvich to jigyli using set method
        myCars.set(moskvichIndex, "jigyli");

        System.out.println("after set to jigyli = " + myCars);

        //replace ford with trabant using single statement
       //indexOf("ford"), "trabant"

        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " +myCars);

        //lada -> bugatti
        /*
        we preventing the error
        if myCars contains "lada"
            find index of lada and set value to bugatti
          else
            print "lada is not found"
         */
        if(myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else{
            System.out.println("Lada is not found");
        }
        System.out.println("after set bugatti = " + myCars.toString());

        /**
         * lamborghini -> prius      (we will gonna sort
         * lada -> lexus
         * trabant -> audi
         */
        for(int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).equals("lamborghini")){
                //change to prius
                myCars.set(i, "prius");
            }else if(myCars.get(i).equals("toyota")){
                myCars.set(i, "lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(i , "audi");
            }
        }
        System.out.println("after loop = " + myCars);
    }
}
