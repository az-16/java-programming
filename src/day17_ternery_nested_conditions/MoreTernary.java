package day17_ternery_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
    int hourlyRate = 50;

//        if(hourlyRate > 50) { // instead typing this If we gonna use ternary
//            reply = "accept";
//        }else{
//            reply = "reject";
//        }
//        System.out.println("reply = " + reply);

        String reply = hourlyRate > 45 ? "accept" : "reject";
        System.out.println("reply = " + reply);


        String todayClass = "Java";
        String teacher = (todayClass.equals ("Java")) ? "Muradil|Saim" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = true;
        //"have a DL, Can drive" : "No DL, cannot drive";
        String driving = isEligibleToDrive ? "yes" : "no";
        System.out.println("Have a DL, can drive = " + driving);


    }
}
