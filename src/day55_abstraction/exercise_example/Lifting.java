package day55_abstraction.exercise_example;

/**
 * Abstruct class can have another abstruct sub class. In that case.
 * Sub class does not need to override abstract methods.
 *
 * First concrete, non abstract child class will override all abstract methods
 */
public abstract class Lifting extends Exercise{ //here we switched abstract-> does not have to override
    public abstract void endLift();

}
