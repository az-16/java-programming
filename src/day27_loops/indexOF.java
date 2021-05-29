package day27_loops;

public class indexOF {
    public static void main(String[] args) {


//        using for loop:
//        if charAt(i) matches letter
//        store the i value into index
//
//
//        "i is found at index 1"
//        You do not have permission to send messages in this channel.

        String word = "github";
        char letter = 'b';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
            //System.out.println(n+ " - " + word.charAt(n));
            if (word.charAt(n) == letter){
                index = n;
                System.out.println(letter +" is found at index " + index);
           break;      //exit for loop
            }
        }
        if(index == -1) {
            System.out.println(letter + " is not present");
        }

    }
}
