package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
/*
Add class GradeEvaluator
main method
char grade = could be one of A,B,C,D,E
grade == 'A'
when grade is A or B, C
    passed with grade
when grade is D
    qualify for retake
when grade is E
    fail
anything else
    invalid grade

 */
        char grade = 'k'; //'B', 'C', 'D', 'E'; // you can change any value
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Passed with grade: " + grade);
        }else if(grade == 'D') {
            System.out.println("Qualify for retake. Grade: " + grade);
        }else if(grade == 'E') {
            System.out.println("Fail grade " + grade);
        }else{
            System.out.println(" Invalid grade " + grade);
        }
    }
}