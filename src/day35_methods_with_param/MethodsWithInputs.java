package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(10);
        int count = 20;
        displayValue(count); //num = 20;
        count = 100;
        displayValue(count);

        greetByName("Aizat");
        greetByName("Nazi");
        // it could be String variable
        String name = "Bayar";
        greetByName("Bayar");
    }
    public static void displayValue(int num) {
        System.out.println("Value is " +num);
    }
    /**
    * method name: greetByName
     * @param/input: String name
     * It prints "Hello {name}, how are you today?"
    */
    public static void greetByName(String name){
        System.out.println( "Hello "+name+", how are you today?");
    }


}
