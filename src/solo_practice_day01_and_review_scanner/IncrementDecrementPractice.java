package solo_practice_day01_and_review_scanner;

public class IncrementDecrementPractice {
    public static void main(String[] args) {

        // ++1; --3;     // 1
        // 5++; 4--

        int y = 10; //10
        int z = y++ + --y /4 + y-- + ++y*2;

        //      10 +   10 /4 +  10 +  10*2
        //                              20
        //              2
        //      10 +2+10+20 = 42
        System.out.println( z);








       // int bananas = 9; //8
        //int bag = ++bananas *2 - bananas-- - bananas++ / 2 + --bananas;
        //          10      *2 - 9          - 8 / 2     +      8
        //              20                      4
        //               11 -4 + 8 = 15
       // System.out.println(bag);
       // System.out.println(bananas);






    }
}