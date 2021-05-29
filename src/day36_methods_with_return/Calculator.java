package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(3.2, 1.99));
            double sum = add(1, 3);
        System.out.println("sum: " + sum);
        //different ways to concatenation
        System.out.println("3.2 + 1.99 = " + add(3.2, 1.99));

        System.out.println(minus(15.99, 10.0));
        System.out.println(multiply(12.99, 15.0));
        System.out.println(divide(72, 9));
    }
    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
    public static double minus(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2){
        double result = num1 / num2;
        return result;
    }
}