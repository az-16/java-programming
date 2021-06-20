package OfficeHours.Practice_6_15_2021;

public class Yahoo extends Email{
    static String domain; //now we have 3// now my email domain HIDDEN
    static {
        domain = "Yahoo";
    }
    //here we generated constructor
    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
