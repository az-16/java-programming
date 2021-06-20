package day50_inheritence;

public class StaticBlockTest {
    public static void main(String[] args) {
        //we will create static block demo object



        StaticBlockDemo st1 = new StaticBlockDemo(); //static 10; constructor 15//it runs one time only  /after constructor will run
        StaticBlockDemo st2 = new StaticBlockDemo(); //constractor 20//it  will run second time b/c 1st one already in memory //constructor
//constructor runs each time
  // initializer runs only one time before doing anything
        StaticBlockDemo st3 = new StaticBlockDemo();//constructor 25
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num); //75

        //tatic block only one time before everything else, constructor each time while creating new object


        System.out.println(StaticBlockDemo.num); //25
    }
}