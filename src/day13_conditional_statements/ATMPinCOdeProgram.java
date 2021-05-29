package day13_conditional_statements;

public class ATMPinCOdeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPinCode = 2233;
        int inputPinCode = 2283; //how compare if they are same? I can with IF

        if (secretPinCode == inputPinCode) ;
        System.out.println("Welcome to your account!");
        System.out.println("You can withdraw, check balance, deposit");
 //   } else {
        System.out.println("Incorrect pincode! " + inputPinCode);
        System.out.println("Please try again!");
        /*
        print "**** WELCOME TO TD BANK ATM ****"
secretPincode => ****
inputPincode => ****
if condition checks if secretPincode equals inputPincode
    true:
        "Welcome to your account."
        "You can withdraw, check balance, deposit"
    false:
        "Incorrect pincode! 1234"
        "Please try again."
print "Thank you for using TD Bank ATM!"
         */
    }
}
