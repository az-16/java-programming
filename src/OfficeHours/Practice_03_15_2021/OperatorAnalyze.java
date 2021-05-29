package OfficeHours.Practice_03_15_2021;

public class OperatorAnalyze {
    public static void main(String[] args) {

        int a =5; //5
        int b = a++ + a-- + a *2 + a + ++a;
        //      5   + 6    + 5*2 + 5  + 6
        //           11     +  10 +11
        //              32
        System.out.println("b " + b);
        System.out.println("a " + a);





    }
}
