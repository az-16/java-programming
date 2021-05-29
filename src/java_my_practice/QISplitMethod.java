package java_my_practice;

import java.util.Arrays;

public class QISplitMethod {
    public static void main(String[] args) {
                    //   0      1      3      4
//        String word = "analyze|solve|coding|writing";
//        String[] wordsArr = word.split("|");
//        System.out.println(Arrays.toString(wordsArr));
        String words = "coding:java:selenium:python";
        String[] splitWords = words.split(":");
        System.out.println(Arrays.toString(splitWords));
        System.out.println("Length of Array - " +splitWords.length);

        for (String each:splitWords) {
            System.out.println(each);

        }
        // How many words in your sentence
        // Most popular interview questions
        //                     0        1   2   3      4    5
        String sentence = "Productive study is makes you motivated";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println("First words: " +wordsInSentence[0]);
        System.out.println("First words: " +sentence.split(" ")[5]);
        System.out.println("Number of words in sentence: " + wordsInSentence.length);

        // print all words in separate line
        for (String each:wordsInSentence) {
            System.out.println(each);
        }



    }
}
