package day49_static;

public class StaticMethods {

    int num = 10;
   static int count  = 5; //here we adding extra keyword static



    public static void displayMessage(String message) {
        System.out.println("message" + message);
        //System.out.println("num = " + num);//error: num is instance variable.static can not access
        System.out.println("count = " + count); // no error. Count is static variable
    }
    public static void anotherStaticMethod() {
        System.out.println("another static method");
    displayMessage("wooden spoon");
}
    //StaticMethods.instanceMethod(); no we have to create object
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();

    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        System.out.println("hello from instance method");
}

}
