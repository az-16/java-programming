package OfficeHours_6_14_2021;
/*
Create a class Twix [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final, sub class
 */

/*
    Twix is a Candy
    Twix ia a Object
    Twix has a brand
    Twix has a quantity
 */
public class Twix extends Candy{

    public Twix( int quantity, boolean hasPeanuts) { //this is constractor for Twix class line 18
        super("Brand", quantity, hasPeanuts);
    }
}
