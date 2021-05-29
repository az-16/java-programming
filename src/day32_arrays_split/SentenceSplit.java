package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" "); //how we do split? of course with space " "
        System.out.println("1st word = " + words[0]);
        System.out.println("2cd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);
       // System.out.println(("4th word = " + words[3])); OUT BOUNDS
        for(String w : words){
            System.out.println(w);
        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] result = googleResult.split(" ");
        System.out.println("2nd number = " + result[1]);




    }
}
