package java_my_practice;

import java.util.Random;
public class RandomNumberInLoop {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random(); //helps jenerate random number
        String password = "";


        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); // random num 0 -70 //helps generate random number
           // System.out.println(random.nextInt(source.length()));
            //I can use index to read my characters source. We can use simple one charAt
            System.out.print(source.charAt(index));
            //add the char to password variable using +=
            // how do add I password in to password b/c password is empty
           // password = password + source.charAt(index); //this is longer way
            password += source.charAt(index);
        }
        System.out.println("\nYour password = " + password);

    }
}
