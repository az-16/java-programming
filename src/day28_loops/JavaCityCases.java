package day28_loops;

import java.time.LocalDate;

public class JavaCityCases {
    public static void main(String[] args) {
        //loop day = 1 till day 30

        //every day there are 200 new cases
        //every sunday (day % 7 == 0) there are 500 new cases
        // "day 1 - daily cases: 200
        //=========
        // print totalCases=
        int totalCases = 0;
        for (int day = 1; day <= 30; day++){ //we assuming that day one is Monday
            if(day % 7 == 0){ // sundays more cases
                totalCases +=500;
            }else{
                totalCases +=200;
            }

           //
            System.out.println("Day " +day+ " I total cases : " + totalCases + LocalDate.now());
        }
        System.out.println("Java city 11/2021 total cases: " + totalCases);
    }
}
