package day44_custom_classes;

/**
 * This class is used to create objects of App class
 */
public class MyAppsRunnerClass {
    public static void main(String[] args) {
        //String app1 = "uber"; this is string object, just characters
        App uberApp = new App();
        //we behavior we can do this app? we can open it
        uberApp.open(); // call open method using object variable
        //Opening Uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); //call open method using object variable

        uberApp.version = 4.0;
        uberApp.open(); //open new version

        /**
         * create more objects
         */


    }

}
