package my_own_oop_practice.bike;

public class BikeObjects {
    public static void main(String[] args) {
        BikeCategory ct1 = new BikeCategory("Polygon", "Xeist X2", 1800.0, 2021, 50);
        ct1.biking(50);
        System.out.println(ct1.toString());

        System.out.println("ct1 make = " + ct1.getMake());
        System.out.println("ct1 model = " + ct1.getModel());
        System.out.println("ct1 price = " + ct1.getPrice());
        System.out.println("ct1 year = " + ct1.getYear());
        System.out.println("ct1 mile = " + ct1.getMile());

        if(ct1.getMile() > 20){
            System.out.println(" I can ride " + ct1.getMile());
        }else{
            System.out.println(" It's too long, I can not ride " + ct1.getMile());
        }

        MountainBike mountainBikeBike = new MountainBike("Sierra", "Cruiser", 449.0, 2019, 30);


    }
}
