package problem_set_1_unit_1;
import java.util.Scanner;
public class PersonalInformationScannerIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" How many people they live with?");
        int numOfPeople = scan.nextInt();
        scan.nextLine();
        if (numOfPeople < 2) {
            System.out.println("Live with less than 2 people");
        } else if (numOfPeople == 3 && numOfPeople == 6) {
            System.out.println("Live with more than 6 people");
        } else {
            System.out.println("What city they live in?");
            String answer = scan.next();
            scan.nextLine();
            if (answer.equals("downtown")) {
                System.out.println("Have you thought about moving to the suburbs");
                answer = scan.next();
                scan.nextLine();

                if (answer.equals("Yes")) {
                    System.out.println("Do it! its great!");

                }else{
                    System.out.println("What are they favorite animal?");
                    String favoriteAnimals = scan.next();
                    scan.nextLine();
                    System.out.println("Wow %animal is a great animal!");

                    System.out.println("How many pets they want?");
                    int numOfPets = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Interesting, do you want %" + numOfPets + " and " + favoriteAnimals + "?");

                }

            }
        }
    }
}
