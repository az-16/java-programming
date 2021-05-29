package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        /**
         * char array with following values:
         * 'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'
         * You do not have permission to send messages in this channel.
         */
    char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'};

    //print each letter using a loop
        for( char each: letters ){
            System.out.print(each + " \t");
        }
        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length); // length here variable thats way no parenthesis
        System.out.println("item.length() = " +item.length());

        String[] fruits = {"banana", "apples", "kiwi", "mango", "papaya", "strawberry"};
        //"bananas-apples-kiwi-mango-papaya-strawberry-"
        String fruitStr = "";
        for(String each : fruits) {
            System.out.println(each +"-");
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr = " +fruitStr);


        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }

}
