package OfficeHours_03_31_2021;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is fun. java class today, not javascript";
        int count = 0;

        while(str.contains("java")) {
            count++;
            str = str.replaceFirst("java", "");

        }
       // "java is fun. java class today, not javascript";
        // count = 3

        System.out.println("Java was found " + count + " times");


    }
}
