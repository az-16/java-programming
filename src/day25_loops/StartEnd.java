package day25_loops;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        /**
         * Enter start and end
         * int start
         * int end
         * print all numbers from start till end separated by space
         * start = 3
         * end = 6
         * 3 4 5 6
         * start = 30
         * end = 6
         * when start is more than end,
         *     "reverse numbering is not supported"
         * --------------------------------------
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();

        if( start > end){
            System.out.println("Reverse numbering is not supported");
        }
        for(int i = start; i <= end; i++){
            System.out.println(i+ " ");
        }
    }
}
