package day54_abstractions;

public abstract class MyAbstractClass {
    int num = 55;
    public void learn() {
        System.out.println("Learning...");
    }
    public abstract void close();

    }

class Sub extends MyAbstractClass{
    public void close() {
        System.out.println("Close - abstract method implementation");
    }

}
class myObjects{
    public static void main(String[] args) {
        //MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();
        }

    }

