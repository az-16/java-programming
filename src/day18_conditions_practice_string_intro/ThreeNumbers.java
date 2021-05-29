package day18_conditions_practice_string_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 150;
        int num2 = 1200;
        int num3 = 1345;
        if( num1 > num2 && num1 >num3){
            System.out.println(num1 + " is largest");
        }else if ( num2 > num1 && num2 < num3) {
            System.out.println(num2 + " is largest");
        }else{
            System.out.println(num3 + " is largest");

        }
    }
}
