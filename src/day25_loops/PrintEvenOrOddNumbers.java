package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        /**
         * print all even numbers between 1-100;
         * print all add numbers between 1-100;
         */
        System.out.println("EVEN NUMBERS 0 - 100: ");
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
            System.out.println("\nODD NUMBERS 0 - 100: ");
            for (int c = 0; c <= 100; c++) {
                if (c % 2 != 0) {
                    System.out.print(c + " ");

                }
            }
        }
    }
