package day18_conditions_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {

//     /*
// add class ScoreRangeTest
//main method
//(score >=1 && score <= 40)
//score:
//    1-40   -> D
//    41-60  -> C
//    61-90  -> B
//    91-100 ->A...
//    else
//        'invalid score'
//      */

        int score =33;
        if (score >= 1 && score <= 30 ) {
            System.out.println("Grade D");
        }else if (score >=1 && score <= 45 ){
            System.out.printf("Grade C");
        }else if (score >= 61 && score <= 90){
            System.out.printf("Grade B");
        }else if (score >= 91 || score > 100){
            System.out.printf("Grade A");
        }else{
            System.out.printf("Invalid score = " + score);
        }

}
    }

