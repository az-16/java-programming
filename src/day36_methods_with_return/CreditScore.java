package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(800);
        checkEligible(760);
        checkEligible(400);
       // System.out.println(checkEligible(711));  //  ERROR - CANNOT PRINT VOID METHOD
        System.out.println(getCreditScore());
        System.out.println("Credit Score = " + getCreditScore());
        int score = getCreditScore();//here assigning returning the score// b/c getCreditScore can not print by itself
        System.out.println("score = " + score);


    }
    public static void checkEligible(int creditScore){
        if(creditScore >= 700) {
            System.out.println("You are eligible for leasing this car");
        }else{
            System.out.println("Sorry, you are not eligible for leasing this car");
        }

}
    public static int getCreditScore() {
                return 800;
}


}



/*
    method name:
    checkEligible
    input/parameter:
    int creditScore

    if creditScore is 700 or more
    you are eligible for leasing this car
    otherwise
    Sorry, you are not eligible for leasing this car
    You do not have permission to send messages in this channel.

 */