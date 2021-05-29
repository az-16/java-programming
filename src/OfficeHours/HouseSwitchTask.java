package OfficeHours;

public class HouseSwitchTask {
    public static void main(String[] args) {
        String name = "Hills";
        double averagePrice = 0.0;
        double ratingOfSchool = 0.0;
        String gatedCommunity;
        String allowsPets;
        switch(name){
            case "Hills":
                averagePrice = 89.000;
                ratingOfSchool = 4.0;
                gatedCommunity = "no";
                allowsPets = "yes";
                break;
            case "Oaks":
                averagePrice = 75.000;
                ratingOfSchool = 3.5;
                gatedCommunity = "no";
                allowsPets = "yes";
                break;
            case "Highland":
                averagePrice = 150.000;
                ratingOfSchool = 4.5;
                gatedCommunity = "yes";
                allowsPets = "no";
                break;
            case "Canyon":
                averagePrice = 201.000;
                ratingOfSchool = 4.8;
                gatedCommunity = "yes";
                allowsPets = "yes";
                break;
            default:
                System.out.println("All information are incorrect");
        }
  // System.out.println("Information about neighbourhood: Rating of Scool " + ratingOfSchool + ", average price of House"
          // + averagePrice + ", gated community " + gatedCommunity + ", pet allows "  + allowsPets);
    }
}
   /*
        Switch tasks
=======================================================

[House Buyer ] - Look at CappuccinoBuyer from class for an idea

You are buying a new house and need to collect information about the houses in a specific area.
 You will give the neighborhood name and see the average house price, rating of school districts near
  by(out of 5), if it is a gated community or not, allow pets or not.
Make variables for all of that information. Given empty defaults for all except the neighborhood name.
 Print the information once at the end.
 Data based on neighborhood name:

        name - Hills
        average price - 89,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes

         */