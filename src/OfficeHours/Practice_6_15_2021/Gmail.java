package OfficeHours.Practice_6_15_2021;

public class Gmail extends Email {

    static String domain; // we have 2 static domains we have

    static { //this is static block
        domain = "Gmail"; //hard coding gmail for the domain
    }

    public static void sendEmail() {
        System.out.println("Sending from GMAIL");
    }
    public static void sendSuperEmail(){
        Email.sendEmail();
    }

    public Gmail(String address, int numberOfEmail) {

        super(address, numberOfEmail);
    }

//    //can a class be static? Yes. Normally for inner classes
//    static class e{ // means gmail have access to the class
//
//    }

}