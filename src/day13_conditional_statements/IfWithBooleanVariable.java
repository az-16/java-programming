package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
       // if(isHungry == true){
        //
        if(isHungry) {
            System.out.println("I am hungry, i will go get somthing to eat!");
            System.out.println("Then code java!");
        } else {
            System.out.println("I am not hungry, I will keep coding java!");
        }
        double price = 130.44;
        boolean isAffordable = price <= 200.0; // 200 is budget
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable) {
            System.out.println("I can afford it, lets buy!");
            System.out.println("isAffordable = " + isAffordable);
        }
    }
}
