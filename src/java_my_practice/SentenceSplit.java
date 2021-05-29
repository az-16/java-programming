package java_my_practice;

public class SentenceSplit {
    public static void main(String[] args){
        String sentence = "I love coding"; // i have a sentence
        //how we do split? of course with " "
        String[] word = sentence.split(" "); //each word will split with space
        System.out.println("1st word = " + word[0]); //and word becomes individuals value in array
        System.out.println("2cd word = " + word[1]);
        System.out.println("3rd word = " + word[2]);

        for (String w:word) {
            System.out.println(w);

        }
        String toDoList = "Focus to homework";
        String[] task = toDoList.split(" ");
        System.out.println("2cd word: " + task[1]);

    }
}
