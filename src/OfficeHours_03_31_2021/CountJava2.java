package OfficeHours_03_31_2021;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";
        int count = 0;

        // str.substring(0,4)
        // str.substring(1,5)
        // str.substring(2,6)

        for(int i = 0; i < str.length(); i++) {

            String eachFourLetters = str.substring(i, i+4);
            System.out.println(eachFourLetters);

        }
    }
}
