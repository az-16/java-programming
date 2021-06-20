package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        /**lets create object of Exercise
        this is called POLYMORHISM: we can have one variable
         Running, FreeWeight, Swimming. So object can be any class
         */
        Exercise exercise = new Running(); // new Exercise(); --> this is not possible. Cannot create object instantiate abstract class
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 mins - calories = " + running.getCaloriesCount(30));

        running.start();
        exercise.perform();
        System.out.println("Running 30 mins - calories = " + running.getCaloriesCount(30));

        swimming.start();
        exercise.perform();
        System.out.println("Swimming 30 mins - calories = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        exercise.perform();
        System.out.println("freeWeight 30 mins - calories = " + freeWeight.getCaloriesCount(30));


    }
}
