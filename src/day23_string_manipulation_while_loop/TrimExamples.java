package day23_string_manipulation_while_loop;

public class TrimExamples {
    public static void main(String[] args){
        String word = " coding ";
        System.out.println(word.trim());

        word = " s e l e n i u m ";
        System.out.println(word.trim());

        //here we will assign

        word = word.trim();
        System.out.println(word);

        //if i want to remove space between them
        // we can USE REPLACE
        word = word.replace(" ", ""); // this will remove any space
        System.out.println(word);

    }
}
