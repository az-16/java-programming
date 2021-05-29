package repl_practice_task;

public class HelloWorldMethod {
    /**
     * Given 2 static methods hello() and world(). Provide an implementation for both of them in order to print
     * appropriate message. So hello() method should print "Hello" and world() method should print "World!".`
     *
     * output:
     * Hello
     * World!
     */
    public static void main(String[] args) {
        hello();
    }
    public static void hello(){
        System.out.println("Hello");
    }
    public static void world() {
        System.out.println("World");
    }

}
