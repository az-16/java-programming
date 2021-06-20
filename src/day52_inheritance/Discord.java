package day52_inheritance;

public class Discord  extends MobileApp { //discord is sub class

    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on Discord");

    }
    //let's override this one
    /*
    What I acces modifier
    Override download method (override comes from java langth pakages aoutomatically
     */

    @Override //parameters, name must be same
    public boolean download(){
        System.out.println("Downloaded Discord 0.0.23 from App Store");
        return true;
    }


    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes); // super lets you refer to the parent class instance. In order to
                                    // access the method implementation that is define the the parent class
        chat("Masha");
    }
    public void printInfo() {
        System.out.println("App name = " + getName());
        System.out.println("App version = " + getVersion());
    }

}