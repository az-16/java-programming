package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Aizat", "Google");
        buildEmail("Aizat Kalybek", "Google");
    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();
        String email = name + "@" + domain+".com";  //here we assigned
        System.out.println(email);
    }
}
