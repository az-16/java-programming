package day18_conditions_practice_string_intro;

public class FizzBuzz {
    public static void main(String[] args) {
       /*
       number = 5
"FizzBuzz" -> when number is divisible by 3 and(&&) 5
"Fizz" -> when number is divisible by 3
"Buzz" -> when number is divisible by 5
        */



        int num = 8;
        if (num % 3 == 1 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if ( num % 3 == 0) {
            System.out.println("Fizz");
        }else if (num % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println(num);


           /*
           int number = 11;
if(number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz");
}else if (number % 3 == 0) {
    System.out.println("Fizz");
}else if (number % 5 == 0) {
    System.out.println("Buzz");
}else {
    System.out.println(number);
}
            */




        }
    }
}
