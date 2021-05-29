package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("j"));

//if company comtains space, print "multiple words company name"
        // else "single word company name"
        if(company.contains("")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("Single word company name");
        }


        String etsyTitle = " Wooden Spoon | Etsy";
        // check if " | " is in etsyTitle
       if(etsyTitle.contains(" | ")) {
           System.out.println("Pass - title check passed");
       }else{
           System.out.println("Fail - title check failed");
       }
        String firstName = "nazbiyke";

       if(firstName.contains("a") && firstName.contains ("e")) {
           System.out.println(" both a && e are present");
       }else{
           System.out.println("a || e not present");

       }
        firstName = "Bayar";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else{

        }
        String email = "Aizat.kalybekova@yahoo.com";
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("Vlaid email");
        }else{
            System.out.println("Invalid email");
        }
        // CASE INSENSITIVE CONTAINS
        if ( email.toLowerCase().contains("t")){
            System.out.println("d is present");
        }else{
            System.out.println(" d is not present");
        }

    }
}
