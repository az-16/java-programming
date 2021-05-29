package java_my_practice;

public class ReverseSentenceInArray {
    public static void main(String[] args) {
        /**
         * java is fun = fun is java
         */
        //Reverse sentence
        String sentence = "I love coding";
        String[] words = sentence.split(" "); // we are giving order like hey java split the space. We spliting by SPACE
        //how to store into String?
        String reversed = "";
        // print words array in reverse order
        for(int i = words.length -1; i >= 0; i--){
            //System.out.println(words[i] +" "); instead of typing we goona store.
            // we declare string OUTSIDE (line 12)
            //  inside we will reverse
            reversed += words[i] +" ";


            }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());
    
    }



    }


