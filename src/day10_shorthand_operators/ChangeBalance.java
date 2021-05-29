package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {

      // decrease balance
        double balance = 4556.70;
        System.out.println("balance: " + balance);
        double blender = 33.99;
        System.out.println("blender: " + blender);
        //decrease balance by bleneder
        balance  = balance - blender;
        System.out.println("Balance after blender: = " + balance);

        double tofy = 12.05;
        System.out.println("Tofy = " + tofy);
        //decrease balance by tofy
        balance = balance - tofy;
        System.out.println("Balance after tofy = " + balance);


            //RETURN BLENDER increase balance by returning
        System.out.println("Returning blender = " + blender);
        balance = balance + blender;
        System.out.println("Balance after returning blender = $" + balance);

        //RETURN TOFY.

        System.out.println("Returning tofy = " + tofy);
        balance = balance + tofy;
        System.out.println("Balance after returning tofy = " + balance);
    }
}
