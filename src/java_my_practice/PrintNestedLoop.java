package java_my_practice;

public class PrintNestedLoop {
    public static void main(String[] args) {
        /**
         * OUTER 1- 5;
         *          INNER 1-10
         *
         *    print stars
         */
        for(int outer = 1; outer <= 20; outer++){
            for(int inner = 1; inner <= outer; inner++){
                System.out.print("* ");

            }
            System.out.println(); // go to the next line


        }


    }
}
