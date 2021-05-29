package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " + Calculator.add(10, 45));
        System.out.println("minus 100- 55= "+ Calculator.minus(100, 55));
        System.out.println("multiply 8 * 15 = " + Calculator.multiply(8, 15));
        System.out.println("divide 99 / 33 = " + Calculator.divide(99, 33));
        //we can also add variables
        double d1 = 286.1;
        double d2 = 145.0;
        double result = Calculator.minus(d1, d2);
        System.out.println("result = " + result);
    }
}
