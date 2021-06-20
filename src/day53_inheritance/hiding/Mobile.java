package day53_inheritance.hiding;

public class Mobile extends Phone {
    String type = "Mobile phone";

    //here we will override use(parent class line 8)  in Mobile class

    /**
     * we can not @Override static method
     * What we are doing here?
     * METHOD HIDING
     * we are hiding use() static method
     */
    public static void use() {
        System.out.println("Using mobile phone");
    }

    public void text() {
        use();
        System.out.println("and sending text message");
    }
    //here little different.
    @Override
    public void call() {
        use();
        System.out.println("and calling on mobile");
    }
}
