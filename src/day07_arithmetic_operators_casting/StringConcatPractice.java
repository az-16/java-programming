package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("Java" + 5 + 3);//java53

        //Thats have to be 8 always we can use parenthesis
        // java 8
        System.out.println("Java" + (5 + 3)); // java8  Java think where ever have paretheses needs to calculated first.
        // Why here 8? Bc (because) of the precedence; here RIGHT TO LEFT rule;

        System.out.println(5 + 3 + "java"); //8 java. Here LEFT TO RIGHT.
        System.out.println(5 + (3+ "java")); //53java. Parethesis always calculated first.

        System.out.println("hello" + 1+ 2+ 3); //hello123
        System.out.println("hello "+ (1+2+3) );//hello 6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2);//hellofriends
        //heloo friends
        System.out.println(str1 + " friends");

        int num1 = 7;
        int num2 = 9;
        System.out.println(num1 + num2); //16 calculation
        //7 9 with space
        System.out.println( num1 + " 9");//7 9
        System.out.println(num1 + " "+num2); //7 9  "" here duble quots gave us space

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2);
        //char ab
        System.out.println(char1 + "" + char2);





    }
}
