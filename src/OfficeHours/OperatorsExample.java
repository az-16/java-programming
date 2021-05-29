package OfficeHours;

public class OperatorsExample {
    public static void main(String[] args) {
//        int a = 3, b=2; // a 2 b=2
//        long c = ( a-- + b) *2 / 3 %2;
//        //          3 +  2  *2 / 3 %2
//        //                 5*2 / 3 %2
//        //                      10/3=3
//        //                          3%2 = 1
//      a = 2;
//      b= 2;
//      c= 1;
//        System.out.println(c);

        int a  = 10;
        a = --a + a++ + a-- + a++;
        System.out.println(a);
        System.out.println(a);

//          a =10
        //   9  + 9

// //a = 9 + 9(next step +1) + 9 ( next step +1) + 9 ( next step +1)

        // 9+9+9+10

        // a = 9 + 9(after math operator add 1) + 10(after math operator subtract 1) + 9(add 1 at the end);


        System.out.println("");
    }
}
