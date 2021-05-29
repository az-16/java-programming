package day19_string_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String word = "Aizat";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("smart girl".length());

        String firstName = "Aizat";
        System.out.println(firstName + "-" + firstName.length());
        int count = firstName.length();
        System.out.println("Count = " + count);

        String color = "Yellow dress";
        System.out.println(color.length());
        System.out.println("Aizat never give up!".length());

        String password = "world";

        /**IF STATEMENT:
         *when password is at least 6 characters:
         * print: valid amazon password
         * ELSE
         * print password too short
         */
            if(password.length() >= 6) {
                System.out.println("Password is valid ");
            }else{
                System.out.println("Password too short");


        }

    }
}
