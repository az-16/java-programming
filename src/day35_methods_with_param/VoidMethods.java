package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {

        printAtoZ();
        printAtoZ();
        //how to print 100 times
        for(int i = 0; i < 100; i++){
            printAtoZ();
        }
       displayUsFlag();
        displayUsFlag();
    }
    /**
     * method name: printAtoZ
     * desc: prints English alphabet in all uppercase
     */

    public static void printAtoZ (){
        for(char i = 'A'; i < 'Z'; i++){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static void displayUsFlag(){
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
        System.out.println();
    }

    }


