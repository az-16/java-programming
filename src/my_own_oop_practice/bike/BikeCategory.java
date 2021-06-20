package my_own_oop_practice.bike;

public class BikeCategory {

    private String make;
    private String model;
    private double price;
    private int year;
    private int mile;
    private static int count; //how many bike's we have we can count

    public BikeCategory(String make, String model, double price, int year, int mile) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.mile = mile;
    }

    @Override
    public String toString() {
        return "BikeCategory{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", mile=" + mile +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;

        }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BikeCategory.count = count;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }
        protected void biking (int mile){
            if(mile == 0 || mile - mile < 0) {

            }

        }
    }

