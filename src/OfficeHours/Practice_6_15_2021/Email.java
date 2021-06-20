package OfficeHours.Practice_6_15_2021;

public  class Email {

    final String ADDRESS; //means that variable can not change//What is the normal convention for final variable? upper case variable
    int numberOfEmail;
    static String domain; //static means my objects going to same exact value 2. domain means sharing the email here

    //What is the variable hidden do? We hide original static domain
    static {
        domain = "generic"; //purpose -> to compare all of the object 2. We have to able initialize
    }

    public Email(String address, int numberOfEmail){
        this.ADDRESS = address;
        this.numberOfEmail = numberOfEmail;
    }
    //can I overload this method
    public static void sendEmail() {
        System.out.println("Sending from PARENT");
    }

    @Override
    public String toString() {
        return "Email{" +
                "ADDRESS='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain=" + domain +
                '}';
    }
}
