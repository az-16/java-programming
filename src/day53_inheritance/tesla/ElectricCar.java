package day53_inheritance.tesla;

public class ElectricCar {
    private String make;   //those are encapsulated
    private String model;
    private double price;
    private int year;
    private int range;
    //let's add static variable
    private static int count; //all object will share this variable// static run only one time //when we o static it's accessible another class
    public static final int MAX_RANGE = 400;

    //here adding constructor method for parent class
    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make); //reuse the code in the setter condition. this.make = make; tay are same, useful when setter has sone condition
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++; //increase count by 1 - every time new created//we want to set the count automatically increased

    }
    public final void charge() {
        System.out.println("Charging the Electric car using plug-in");
        this.range = MAX_RANGE;
    }

    public static int getCount() {
        return count;
    }
    //in parent class we are creating template for object class
    //here generating toString
    @Override //where is overriding from? from paren class
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }
    //here generated getter and setter

    public int getRange() {

        return range;
    }

    public void setRange(int range) {

        this.range = range;
    }

    //we can add another behavior
    //model3.drive(34);
    protected void drive(int miles) { //if we use protected to use only sub classes only.
        if (range == 0 || range - miles < 0) {
            System.out.println("ERROR: Cannot drive that far, need to charge");
        } else {
            range -= miles;
            System.out.println("Driving " + miles + " miles... ");
        }
    }

    //here generated getter and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (!make.isEmpty()) {
            System.out.println("ERROR: Make cannot be blank ");
        } else {
            this.make = make;
        }
    }
        public String getModel () {
            return model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        public int getYear () {
            return year;
        }

        public void setYear ( int year){
            this.year = year;
        }
    }

