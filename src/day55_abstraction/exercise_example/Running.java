package day55_abstraction.exercise_example;
/**
 * Running is a concreate class it is extending an abstract class.
 * It must override all abstract methods in Parent exercise class
 */

public class Running  extends Exercise{
    @Override
    public void perform() {
        System.out.println("Performing Running exercise");

    }

    /**
     *
     * @param minutes - how long is exercise is performed
     * @return we are assuming average num of calories while running is 13
     */
    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    } //must have to override
}
