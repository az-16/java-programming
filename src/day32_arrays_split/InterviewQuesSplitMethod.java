package day32_arrays_split;
import java.util.Arrays;
public class InterviewQuesSplitMethod {
    public static void main(String[] args) {
                    //   0   1      3        4
        String words = "java:python:selenium:html"; //
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = "+wordsArray.length);

        for(String each : wordsArray) {
            System.out.println(each);
        }
        //how many words in your sentence
        //those are very popular IQ
        String sentence = "today I am coding java arrays on Sunday";
        String[] wordInSentence = sentence.split(" "); // how do I stored in my varaible
        System.out.println("first word: " + wordInSentence[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);
        System.out.println("NUmber of words in sentence = " + wordInSentence.length);
        // print all word in separate line
        for (String each : wordInSentence) {
            System.out.println(each);
        }
    }
}
