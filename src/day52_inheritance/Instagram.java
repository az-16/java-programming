package day52_inheritance;

public class Instagram extends MobileApp { //how we do know this is a mobile app of course we extending

    //what is the  behavior for instagram?

    public void postPhoto() {

        System.out.println("Posting photo on instagram");

    }
    @Override
    public void useTheApp(int minutes) { //we using void to simple without returning
        super.useTheApp(minutes);
        System.out.println("Using instagram app faetures for");
        //one of the features
        postPhoto();
        //method can use another method
    }
}
