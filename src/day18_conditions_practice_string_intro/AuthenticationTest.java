package day18_conditions_practice_string_intro;

public class AuthenticationTest {
    public static void main(String[] args) {

        /*last4SSN
                pinCode

        expLast4SSN
                expPinCode
        ------------------------------
                when both match:
        "Authentication successful"
        when expLast4SSN does not match:
        "Last 4 of SSN did not match"
        when pinCode does not match:
        "pinCode did not match"
         */

        int expLast4SSN = 1487;
        int exPinCode = 2729;

        int last4SSN = 1459;
        int pinCode = 2726;

        if (expLast4SSN == last4SSN && exPinCode == pinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (expLast4SSN != last4SSN) {
                System.out.println("Last 4 of SSN did not match");
            }
            if (exPinCode != pinCode){
                System.out.println("Pin code did not match");




            }
        }
    }
}

