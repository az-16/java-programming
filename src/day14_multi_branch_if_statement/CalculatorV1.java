package day14_multi_branch_if_statement;

public class CalculatorV1 {
    public static void main(String[] args) {
       /*
       add new class CalculatorV1
add main method

num1, num2
char operator -> -, +, *, /

when operator: + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
any other: "invalid operator"
        */
        double num1 = 25.50;
       double num2 = 15.1;
       char operator = '!'; //-, *,/ // YOU CAN CHANGE HERE ANY OPERATORS
        if(operator=='+') { //if ir true execute it
            System.out.println(num1 + num2);
        }else if(operator== '-') {
            System.out.println(num1 - num2);
        }else if(operator == '*') {
            System.out.println("num1 *num2");
        }else if(operator == '/') {
            System.out.println(num1 / num2);

        }else{
            System.out.println("Just coding Java");






        }



}

}
