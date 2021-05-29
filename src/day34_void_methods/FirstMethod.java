package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage(); // 1 st call the method
        displayMessage(); // 2cd call the method
        displayMessage(); // 3thd call the method

        for(int i = 1; i <= 100; i++) {
            System.out.print(i+" - ");
            displayMessage();
        }
    }
    //this is our reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends!");

    }

}
