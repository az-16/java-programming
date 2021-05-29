package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 12;
        //check if age IS NOT more than 7. print "Need to sit in child car seat"
        if(!(age > 7)) {
            System.out.println("Need to sit in child car seat. Age = " + age);
        }else{
            System.out.println("Can sit normal seat. Age = " + age);
        }

        boolean isSmokingAllowed = false; //yes -> true if it IS NOT -> false
        //if smoking is not allowed: print "Smoking is now allowed here. Exit."
        if(!isSmokingAllowed){
            System.out.println("Smoking is now allowed here. Exit.");
        }
        boolean isAffordable = true;
        // if it is not affordable then print "Item Not affordable"
        if(!isAffordable){
            System.out.println("Item Not affordable");
        }
        String env = "qa";
        if(!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = "Tesla";
        //if its NOT Tesla, print "Not interested."
        if(!carModel.equals("Tesla")){
            System.out.println("Not interested.");
        }
        String secretPassword = "abc1234";
        String inputPassword = "abc4321";
        //if inputPassword is Not equals inputPassword: print "Incorrect password"
        if(!inputPassword.equals("abc1234")){
            System.out.println("Incorrect password");
        }
    }
}
