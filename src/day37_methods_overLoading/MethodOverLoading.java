package day37_methods_overLoading;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading.sum(19, 6);
        sum(10.4, 12.4);
        sum(10, 6.50); //automatically casting line 21
        sum(4,1,2);
        sum((int)4.2, 1,2);
        sum("Hello", "World");
    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));
    }

    //what is the signature
    //now is working b/c same name with different parameters
    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int num1, int num2, num3)");
        System.out.println("Redult = " + (num1 + num2 + num3));
    }
    public static void sum(double num1, double num2) {
        System.out.println("sum(double, double");
        System.out.println("Result = " +(num1 + num2));
    }
    //variable name called signature. ex. sum
    public static void sum(String str1, String str2){
        System.out.println("sum(string, string");
        System.out.println("Result = " +str1 +str2);
    }
}