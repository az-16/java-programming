package iq_java_code;

public class SwappingValues {
    public static void main(String[] args) {

        int c = 8;
        int d = 10;
        int temp = 0;
        //System.out.println("c = " + c + "d = " +d);
        temp = c; //8
        c = d; // 10
        d = temp;  // 8
        System.out.println("c = " + c + "d = " +d);
        //System.out.println();



        int a = 7;
        int b = 10;
        int sum = a +b;
        //System.out.println("a = " + a + "b = " +b);
        a = (sum) -a; //10
        b = (sum) -b; // 7

        System.out.println("a = " + a + "b = " +b);
    }
    
}

