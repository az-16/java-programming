package day11_comprason_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args){

        System.out.println(10==10);
        System.out.println(200>100);
        System.out.println(985.44 < 98547.8);
        System.out.println(10<=11);
        System.out.println(5 >= 3);
        System.out.println(-100 != 44);

        int a = 100;
        int b = 200;
        System.out.println(a ==b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a != b );

        boolean result = 5 == 5; //here we are practicing assigning to variable
        System.out.println("result = " + result);
        result = 10>10;
        System.out.println("Result = " + result);
        result = 33<44;
        System.out.println("Result = " + result);

        result = 10 >= 10;
        System.out.println("result = " + result);//why true? because of the second obtion =
        
        result = 123<=124;
        System.out.println("result = " + result);
        
        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println( city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");

        String name = "Nazbiyke"; // here we are assigning to variable to BOOLEAN
        boolean checkName = name == "Nazbiyke";
        System.out.println("checkName = " + checkName);
        checkName = name != "Bayar"; //here we are comparing
        System.out.println("checkName = " + checkName);


        


    }
}
