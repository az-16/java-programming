package OfficeHours;

import javax.sound.midi.Soundbank;

public class BakingContest {
    public static void main(String[] args) {
          /* ou are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be
          averaged and compared with the 2 other people in the contest.

       Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

        If your score is more than both of the other people then print "First place!"
        If your score is more then one other person then print "Second place"
        If your score is less than both of the other people then print "Third place"*/
//==================================================================================================================
        /*Okay on that one, you are comparing your score to the other persons scores.  So first thing you need to do is
         make a varirable for :   myScore = (judge1 + judge2 + judge 3)  / 3
                [12:50 PM]
        Then you will compare myScore to otherperson 1....and my score to otherperson2 on the same line.  If bigger than
        both of those, it's first place.
                [12:51 PM]
        Then do that 2 more times for the ohter scenarios. 2nd line:   myscore is bigger than other person 1 but less than
        otherperson 2, and 3rd line:  my score is less than other person 1 and less than other person 2
                [12:51 PM]
        Does it makes sense?  Rewrite it that way and send it to me.*/

        /*String myScore = ("judgeSc1 + judgeSc2 + judgeSc3);
        int otherPersonSc1= 1;
        int  otherPersonSc2 = 2;
        int bothPerson = otherPersonSc2 + otherPersonSc2;

        if (myScore > bothPerson) {
            System.out.println("FirstPlace");
        } else if (myScore > otherPersonSc1) {
            System.out.println("Second place ");
        } else if (myScore < bothPerson) {
            System.out.println("Third place");

        }else{
            System.out.println("Fourth place");*/
        /**
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         */

         int myScore = 3; //"judgeSc1 + judgeSc2 + judgeSc3

        int otherPersonSc1 = 1;
        int otherPersonSc2 = 2;

        if (myScore > otherPersonSc1 && myScore > otherPersonSc2) {
            System.out.println("First place");
        } else if (myScore > otherPersonSc1 && myScore < otherPersonSc2){
        System.out.println("Second place");

         }else if (myScore < otherPersonSc1 && myScore < otherPersonSc2){
            System.out.println("Third place");
        }else{
            System.out.println("Not places");
        }
        }

    }

