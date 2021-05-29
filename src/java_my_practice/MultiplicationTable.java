package java_my_practice;

public class MultiplicationTable {
    public static void main(String[] args) {
        /**
         *  OUTER: 1 to 10 {
         *          INNER 1to 10}
         *                  PRINT OUTER *INNER + " "
         *       }
         *       NEW LINE
         *       }
         */


        for(int outer = 1; outer <= 10; outer++){
            for(int inner = 1; inner <= outer; inner++){
                System.out.print(outer * inner +"\t");
            }
            System.out.println();

        }
    }
}
