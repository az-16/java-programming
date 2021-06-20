package OfficeHours_6_14_2021;


    /*
    Create a class Candy [Parent class]

    * instance variables:
        - brand (String), quantity (int), contains peanuts (boolean),

    * static variables:
        - number of total candy (int)

    * constructor to set all variables
        - Also increments total candy every time an object is made

    * encapsulate
        - Add one set of logic for quantity(количество) [ given number cannot be less than 0, otherwise it is not assigned]

    * override toString
     */

    public class Candy {
        //here we encapsulating(is hiding data)
        //String brand, int quantity etc those are instance variables
       private String brand;
       private int quantity;
       private boolean hasPeanuts;
       private static int totalNumberOfCandies; //what is the purpose this variable? Know how many total number of Candy objects were made

       //here set up consturactor
       public Candy(String brand, int quantity, boolean hasPeanuts){
           this.brand = brand;//what is this? it a reference to the instance. Instance of the candy class it is a candy class
         setQuantity(quantity); //we define the logic here
           this.hasPeanuts = hasPeanuts;
           totalNumberOfCandies++; //we did not this here b/c it is a static
       }


        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
           if(quantity > 0){ //we set up some logic here
               this.quantity = quantity;
           }

        }

        public boolean isHasPeanuts() {
            return hasPeanuts;
        }

        public void setHasPeanuts(boolean hasPeanuts) {
            this.hasPeanuts = hasPeanuts;
        }

        public static int getTotalNumberOfCandies() {
            return totalNumberOfCandies;
        }


        @Override
        public String toString() {
            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }
    }

