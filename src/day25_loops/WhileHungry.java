package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        //boolean isHungry = true;
        //int bananas = 0;
        //it takes 3 bananas for isHungry to be set to false

        //while hungry
        //eat banana1
        //when bananas reaches countToFull
        //set hungry to false
        //increase banana by 1
        boolean isHungry = true;
        int banana = 0;
        int countToFull = 3;

        while (isHungry){
            banana ++;
            System.out.println("Eating banana: \uD83C\uDF4C " + banana);
            isHungry = banana ==countToFull ? false : true;
//            if (banana == countToFull){
//                isHungry = false;
            }

        System.out.println("Had enough bananas, lets get back to studying");
        }

    }

