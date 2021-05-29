package day31_arrays;

public class StringLanguage {
    public static void main(String[] args) {

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}
