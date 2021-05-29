package solo_practice_day01_and_review_scanner.ShortHandOperatorsEx;

import javax.sound.midi.Soundbank;

public class Practice {
    public static void main(String[] args){
        int visitors = 50;
        System.out.println("Zoom visitors = " + visitors);
        visitors = visitors + 23;
        System.out.println("Zoom visitors = " + visitors);

        //here we are going to use SHORT HAND OPERATORS increasing by 5
        //we are using her short hands: ex. visitors+=
         visitors += 9;
        System.out.println("Zoom visitors = "  + visitors);

        //17 visitors left Zoo
        //this is alonger way: visitors = visitors - 17
        //short way: visitors -=17
        visitors -= 17;
        System.out.println("17 visitors left Zoo = " + visitors);

        //here using another variable. increasing
        int walkingPeoples = 10;
       // visitors = visitors + walkingPeoples;//logn way
        System.out.println("Zoom visitors = " + visitors);
        visitors += walkingPeoples;
        System.out.println("Zoom visitors = " + visitors);

        ///LETS DECLARE String
        String word = "Java";
        System.out.println(" word = " + word);
        word = word + " programming ";
        System.out.println("word = " + word);
        //using short hand// add "is fun"
        word += " is fun ";
        System.out.println("word = " + word);
        //here we are going to increase "word" be "selenium"
        String selenium = "but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345; //add 12367 to word
        System.out.println("word = " + word);

        //Lets try CHAR
        char letter = 'A';
        System.out.println("Letter = " + letter);
        letter += 3;
        System.out.println("Letter = " + letter);
        //add 'J' to letter
        letter += 1;
        System.out.println("Letter = " + letter);

        double visitorsFee = 13.50;
        System.out.println("Visitors fee = " + visitorsFee);
        //early bird fee is 50 off
        //decrease by half/
        //visitorsFee = visitorsFee/2
        visitorsFee /= 2;
        System.out.println("Visitors fee = " + visitorsFee);
        //christmast day all visitors are Free
        visitorsFee -= visitorsFee; //visitorsFee = visitorsFee - visitorsFee;
        System.out.println("Christmast day free = " + visitorsFee);





    }
}
