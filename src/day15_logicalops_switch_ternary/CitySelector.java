package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
    /*
    add new class CitySelector
add main method
city
"Moscow" || "Tampa"
    -> "Willing to relocate to Moscow"
else
    -> "Not considering Seattle"

     */

        String city = "Tampa";
        //Moscow || Tampa
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering " + city);
        }
        String teacher = "Nadir";
        // Saim || Muradil
        //it is java class with
        //otherwise: Soft Skills class with Nadir
        //any other techer -> Some class with Gurhan/Akbar
        if (teacher.equals("Saim") || teacher.equals("Muradil")) {
            System.out.println("it java class with " + teacher);
        } else {
            System.out.println("Soft Skills class with " + teacher);
        }
        System.out.println("Some class with Gurhan Akbar");

        //company - "Google", salary >= 100k -> accept offer
        String company = "AizatTech";
        double salary = 95_000.0;
        if (company.equals("Google") || salary >= 150_000) {
            System.out.println("Accepting offer from company " + company);
        } else {
            System.out.println("Rejecting offer from " + company);

        }

    }
        }


