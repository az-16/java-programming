package day21_string_manipulation;

public class ReplacePractice{
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());

        // CHANGE HITHUB TO GITLAB // "hub" change to "lub"
        System.out.println(word.replace("hub", "lub")); // change just this line
        System.out.println("Word = " +word); // here still github

        //change to "github" to "gitlab"// "hub" to make "lab"
        //  we should assign back
        word = word.replace("hub", "lab");
        System.out.println("Word = " + word);
       //gitlab
        // i ->o; a- i = gotlib
        System.out.println((word.replace('i', 'o').replace('a', 'i')));
        //print "java is fun" without spaces "javaisfun
        String sentence = "java is fun";
        String withNoSpaces = sentence.replace("java is fun", "javaisfun");
        System.out.println("Sentence without spaces -" + withNoSpaces);
        
        // second option
        withNoSpaces = sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + withNoSpaces);

        // "java" -> "selenium" , "fun" -> "a lot of fun" -> assign back to sentence
        System.out.println(sentence.replace("java", "selenium").replace("fun","a lot of fun"));
       // sentence = sentence.replace("java", "selenium").replace("fun","a lot of fun"); //all in one line
        //also we can do in two lines
        sentence = sentence.replace("java", "selenium");
        sentence =sentence.replace("fun","a lot of fun");
        System.out.println("sentence - " +sentence);

        String result = "1-48 of over 4,000 results for java book";
        //how to remove everything and print 4000
        result= result.replace("1-48 of over","")
                .replace(",","")
                .replace("results for java book","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if(count > 0){
            System.out.println("Search success");
        }



    }
}
