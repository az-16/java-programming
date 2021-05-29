package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;
        if(location.equals("Honolulu") && salary >= 120.000  && isRemote && hasBenefits ) {
            System.out.println("Sure, I will accept this offer");
        }else{
            System.out.println("Lets ask another offer or negotiate");
        }

    }
}
/*
add new class JobOfferSelector
add main method
declare and initialize below variables
//location, salary, remote, benefits
add if statement with && operator to decide to accept job offer or no.

 */