package day18_conditions_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {

        /*
        num = 4;
when num is divisable by 2
    print num is even
otherwise
    print num is odd

         */

        int num = 5;
        System.out.println(num % 2); // remainder will be 1
        System.out.println(num % 2 ==0); // it can be true or false


      if ( num % 2 == 0) { //divisible by 2
          System.out.println("Num is even");
      }else{
          System.out.println("Num is odd");




      }
    }
}
