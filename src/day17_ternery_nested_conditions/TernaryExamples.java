package day17_ternery_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 75;
        String result1;
        if (score1>60){
            result1 = "Pass";

        }else{
            result1 = "fail";
            System.out.println("result1 = " + result1);

            //  with ternary
            int score = 88;
            String result = (score > 60) ? "Pass" : "Fail";
            System.out.println("result = " + result);

            String quality = "good"; //if it is BAD print out 0;
            System.out.print(quality.equals("good") ? 100: 0);
           int rating = quality.equals("good") ? 100 : 0;
           System.out.println("rating = " + rating);


            int score3 =100;
           char grade = (score3 > 90) ? 'A' : 'B';
           // System.out.println("grade = " + grade);
           // if (score > 90) {
         //       grade = 'A';
          //  }else{
           //     grade = 'B';
            }

        }






        /*String result = (score>60) ? "pass" : "fail";
        int x = (quality.equals("good")) ? 100 : 0;
        char grade = ( score>90) ? 'A' : 'B';
        String evenOdd = (score%2==0) ? "even" : "odd";*/
    }

