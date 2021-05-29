package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        System.out.println("Letter = " +letter);
        letter ++;
        System.out.println("letter = " + letter);

   while (letter <='z'){
       System.out.println("Letter = " +letter);
      letter++;
   }
// print alphabet reverse order
        letter = 'z';
            while (letter >='a'){
                System.out.print(letter+ " ");
                letter--;
            }


    }
}
