package day50_inheritence;

public class AudioBook extends Book {
    int length;
    String narrator;

    public void listen() {
        System.out.println("Listening to AudioBook");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("type = " + type);
        System.out.println("narrator = " + narrator);
    }
}
