package day55_abstraction.exercise_example;

/**
 * FreeWeight class is
 */
public class FreeWeight extends Lifting{
    @Override
    public void perform() { //this 2 methods are being overridden that are from Exercises abstract class. We are overrided
        System.out.println("Performing FreeWeight");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");

    } //this class child of lifting class
}
