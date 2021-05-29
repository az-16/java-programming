package repl_practice_task;
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        /**
         * In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point
         * value.
         *
         * The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then
         * multiplied by the degree of difficulty for that dive. The degree of difficulty ranges from 1.2 to 3.8 points.
         * The total is then multiplied by 0.6 to determine the divers score.*
         * Flow:
         ** Accept the 7 scores from the judges
         * Accept the difficulty number
         * Display the final score
         * Enter score for judge 1:
         * 1
         * Enter score for judge 2:
         * 5
         * Enter score for judge 3:
         * 5
         * Enter score for judge 4:
         * 5
         * Enter score for judge 5:
         * 5
         * Enter score for judge 6:
         * 8
         * Enter score for judge 7:
         * 9
         * Enter difficulty:
         * 2.1
         * Total: 35.
         */
    Scanner scan = new Scanner(System.in);
    float [] score = new float [7];
    
    for(int i = 0; i < score.length; i++) {
        System.out.println("Enter score for judge 1 " +(i +1) + ":"); // 1 for starting from 1
        score[i] = scan.nextFloat();
        
    }
        System.out.println("Enter difficulty");
        float difficulty = scan.nextFloat();
    
        Arrays.sort(score);
        score[0] = 0;
        score[score.length-1] = 0;

        float sum = 0;
        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum);

        float result = sum * difficulty * 0.6f;
        System.out.println("Total: " +result);





    }
}
