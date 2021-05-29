package day19_string_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "kg";
            // KG              ==               KG             kg convert to (KG)UpperCase and assign to back country code
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");

    }
    }
}

