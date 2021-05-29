package problem_set_1_unit_1;

public class Operators {
    public static void main(String[] args) {
        /**Analyze each step, What is the result of a, b, and c?
         int a = 3, b = 2;
         long c = (a-- + b) * 2 / 3 % 2;
         ----------------------------------------------------------
         Analyze each step, What is the result numOne, numTwo, and biggest?
         int numOne = 10;
         int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
         int biggest = numOne > numTwo ? numOne : numTwo;
         *
         */

        // 1. Task Operators
        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
                //(3 + 2)= 5 *2= 10 /3= 3 %2 = 1
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        //2. Task
        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;

        // 10 *3 = 30 + 12 + 10%2= 42 + 0 = 42
        System.out.println(biggest);// 42
        System.out.println(numOne);
        System.out.println(numTwo);







    }
}
