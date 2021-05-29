package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args){
        System.out.println(10 / 3);// because this whole number. no decimals
        System.out.println(5 / 2); //

        int num1 = 10;
        int num2 = 2;
        System.out.println(num1 / num2);

        System.out.println(5.0 / 2.0);//2.5
        System.out.println(5.0 / 2);//2.5
        double d1 = 12.0;
        double d2 = 3.0;
        System.out.println(d1 / d2);// 4.0 b/c double have decimis

        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount); //2.0
    }
}
