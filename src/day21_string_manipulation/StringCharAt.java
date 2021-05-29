package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args){
        //0123
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println((word.charAt(1)));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        //System.out.println(word.charAt(4)); ERROR
        System.out.println(word + "-" + word.length()); //4

        String company = "Cybertek";
        System.out.println("First letter - " + company.charAt(0));
        //I want to declare variable.What data type should we use?

       // System.out.println(first);
        // C y b e r t e k print one line

        char zero = company.charAt(0);
        char first = company.charAt(1);
        char second = company.charAt(2);
        char third = company.charAt(3);
        char fourth = company.charAt(4);
        char fifth = company.charAt(5);
        char sixth = company.charAt(6);
        char seventh = company.charAt(7);


      //  System.out.print(first + " ");
       // System.out.print(second + " ");
       // System.out.print(third + " ");
      //  System.out.print(fourth + " ");
      //  System.out.print(fifth + " ");
      //  System.out.print(sixth + " ");
      //  System.out.print(seventh + " ");

        //WE CAN DO IN ONE LINE TOO
        System.out.println(zero + " " + first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh);
        String withSpaces = zero + " " + first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " + seventh;
        System.out.println("withSpace = " + withSpaces);






    }
}
