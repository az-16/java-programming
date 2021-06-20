package day50_inheritence;
//objects created out of class
public class BookObjects {
    public static void main(String[] args) {
        //here creating parents object
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;
        //book.pages = 40; ERROR b/c pages is EBook
        //pages is not in Book

        System.out.println(book.title );
        System.out.println(book.author );
        System.out.println(book.type );
        System.out.println(book.price );

        //here we creating object for AudioBook
      AudioBook audioBook  =new AudioBook();
      //here assigning some information
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 45.99;
        audioBook.title  ="Selenium CookBook";
        audioBook.type = "Automation";
        audioBook.listen();


        //here we are creating object for EBook
       EBook eBook  =new EBook();
        //here assigning some information
       eBook.author = "Unmesh";
        eBook.price = 45.99;
        eBook.title  ="Selenium CookBook";
        eBook.type = "Automation";



    }
}
