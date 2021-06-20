package day55_abstraction.exercise_example;

public abstract  class Exercise { //class cannot be abstract at same time. Final means no inheritance
   public void  start() { //adding in to parent class method //this method not abstract
       System.out.println("Warming up and starting the exercise");

   }

    /**
     * we have to hide from this class/we added ABSTRACT METHOD->METHOD WITHOUT BODY/implementation JUST SIGNATURE
     * -purpose: letting sub classes implement/override their own way
     * public cannot be static
     */

    public abstract void perform(); //1.private is not inherited (if we want to add private) 2. method can not be final and abstract at same time.
    //FINAL MEANS CANNOT OVERRIDE (if we want to add final), ABSTRACT MEANS must OVERRIDE


    /**
     * another abstract method that concrete sub classes will override/implement
     * @param minutes - how long is exercise is performed
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);

}
