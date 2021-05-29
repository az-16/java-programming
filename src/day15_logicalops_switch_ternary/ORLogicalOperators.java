package day15_logicalops_switch_ternary;

public class ORLogicalOperators {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true||false));
        System.out.println("false || true = " + (false||false));
        System.out.println("false ||false = " + (false|| false));
         int apples = 5;
         int oranges = 7;
        System.out.println(apples>3|| oranges >4);
        if(apples>3 || oranges > 4) {
            System.out.println("No  need to buy any fruits today");
        }else{
            System.out.println("I have to go store and buy some fruits");

        }
        System.out.println(apples > 1 || oranges < 2);
    }
}
