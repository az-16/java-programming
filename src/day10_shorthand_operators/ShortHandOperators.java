package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars +=5;
        System.out.println("cars in parking lot = " + cars);

        // 6 cars left the parking lot
       // cars = cars -6;
        cars -=6;
        cars-=1;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);
        String word = "Java";
        System.out.println("word = " + word);
      //  System.out.println("word = ")
        //add " is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun. ";
        //TODO






    }
}
