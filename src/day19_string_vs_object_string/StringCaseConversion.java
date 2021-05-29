package day19_string_vs_object_string;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "123 Java Is Fun";

        //convert word to all lowercase
        System.out.println(word.toLowerCase());
        System.out.println(sentence.toLowerCase());
        System.out.println("JAVA".toLowerCase());

        //practice
        System.out.println("Allah Help me".toLowerCase());

        String topic = "IT Coding";
        String wholeSentence = "Coding with Java";
        System.out.println(topic.toLowerCase());
        System.out.println(wholeSentence.toLowerCase());

        topic.toLowerCase();
        System.out.println(topic);

        topic = topic.toLowerCase();
        System.out.println(topic);

        String topicInLCase = topic.toLowerCase();
        System.out.println("TopicInCase = " + topic.toLowerCase());

        //==========================================================================
        String city = "Chicago";









        String wordInLCase = word.toLowerCase();
        System.out.println("WordInLCase = " + wordInLCase);

        // change word to all lowercase letters
        word = word.toLowerCase();
        System.out.println("WordInLCase = " + wordInLCase);
        //change word to all lowercase letters and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);







        //convert all UpperCase
        System.out.println(word.toUpperCase());
        System.out.println(sentence.toUpperCase());

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        // How can I change company "Amazon" to "AMAZON"
        // pre assign//assign back
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
