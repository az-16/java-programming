package OfficeHours.Practice_04_12_2021;

public class MaxMinPrimary {
    public static void main(String[] args) {
        /**
         *
         */
    int [] arr = {3,1,500,-3,-10,4,3};
    int min = arr[0];
    int max = arr[0];

    for (int each : arr) {

        if(each <min) { //1<3; -3 < 1
            min = each; // min = 1
        }

        if(each > max) {
            max = each;
        }

    }

        System.out.println("MIN: " +min);
        System.out.println("MIN: " +max);
        //-----------------------------------------------
//
//        nt [] arr = {3,1,500,-3,-10,4,3};
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int each : arr) {
//
//            if(each <min) { //1<3; -3 < 1
//                min = each; // min = 1
//            }
//
//            if(each > max) {
//                max = each;
//            }

        }
}
