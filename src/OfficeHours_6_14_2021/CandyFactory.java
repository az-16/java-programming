package OfficeHours_6_14_2021;
/*
Create a class CandyFactory [ No inheritance with Candy classes ]

    This class is to create objects of Candy, Take5, Twix and see how they are working
 */
public class CandyFactory {
    public static void main(String[] args) {
        //this object for parent class
        Candy candy = new Candy("generic", 10, true);
        System.out.println(candy);

        //this is object for child class
        Take5 barOne = new Take5(4, true);
        System.out.println(barOne);

        //constructors are not inherited. that's means nothing to override it

        Twix barTwo = new Twix(2, false);
        System.out.println(barTwo);

        System.out.println(Candy.getTotalNumberOfCandies());

    }

}
