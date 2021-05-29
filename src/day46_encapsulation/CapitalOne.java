package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        //we will assign data
        acc.setAccountNumber(25736498732L);
        acc.setBalance(1000.0);
        acc.setAccountHolder("Aic");

    }
}
