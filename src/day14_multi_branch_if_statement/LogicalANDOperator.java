package day14_multi_branch_if_statement;

public class LogicalANDOperator {
    public static void main(String [] args){
        System.out.println(true && true); //true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

     System.out.println(10 > 5 && 1 ==1);
     System.out.println(17<25 && 22<20);
     System.out.println(3 <1 && 30>28);
     System.out.println(4>=6 && 7==8);

     int bananas = 30, cherries = 14;
     boolean check = bananas > 14 && cherries >=14;
        System.out.println("check = " + check);
        //we can also use if statement
        if(bananas > 9 && cherries >10) {
            System.out.println("I have enough fruits");
        }else{
            System.out.println("I have to go grocery to buy fruits");
        }
    }
}

