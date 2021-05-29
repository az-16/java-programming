package day10_shorthand_operators;

public class IncrecementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = "+i);
        i++;
        System.out.println("i = " + i);
        i++; //1
        i++;//1
        ++i;//1
        ++i;//1
        System.out.println("i = " +i);
         int linesOfCode = 15;
         System.out.println("Lines Of Code = " + linesOfCode);
         //increase linesOfCode by 1, 2 difeerent ways that we learnes today
        linesOfCode = linesOfCode + 1;
        linesOfCode +=1;
        linesOfCode++; //usually no space after variable
        ++linesOfCode;
        System.out.println("Lines Of Code = " + linesOfCode);

        //type 4 different ways of decreasing by 1
        linesOfCode = linesOfCode -1;
        linesOfCode-=1;
        --linesOfCode;
        linesOfCode--;
        System.out.println("Lines Of Code = " + linesOfCode);

        //lets try char
        char letter = 'a';
        System.out.println("Letter = " + letter);
        letter++; //here we changing here letter  b. like a,b,c,d. etc. increasing by 1 adding letter
        ++letter;//changing to next character
        System.out.println("Letter = " + letter);
        letter--; //we can go back b
        System.out.println("Letter = " + letter);
        letter--; letter--; letter--; //this is also wors in same line
        System.out.println("Letter = " + letter);

        long a = 3_000L;
        double b = (float) a;
        System.out.println(b);

        System.out.println("Result A" + 0 + 1);
        System.out.println("Result B" +(1) + (2));

        System.out.println("5+2 = " +3 + 4);
        System.out.println("5+2 = " +(3 + 4));


    }
}
