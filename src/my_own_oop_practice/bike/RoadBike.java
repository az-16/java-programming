package my_own_oop_practice.bike;

public class RoadBike extends BikeCategory {
    public RoadBike( String model, double price, int year, int mile) {
        super("Polygon", model, price, year, mile);
        System.out.println("Great Mountain bike!");

    }
}
