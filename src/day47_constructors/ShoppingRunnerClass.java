package day47_constructors;

public class ShoppingRunnerClass {

    public static void main(String[] args) {
        Shopping basket = new Shopping(0);
        basket.getItems().add("shirt");
        basket.setTotal(15);
        basket.getItems().add("dress");

        System.out.println(basket);
    }
}
