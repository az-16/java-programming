package day14_multi_branch_if_statement;

public class DayActivity {
    public static void main(String[] args) {
       /*

weather ->  "sunny", "rainy", "snowy", "windy" ...

when "sunny" :
    -> "Go to park, hiking, and code java"

when "rainy" :
    -> "stay home, drink tea, and code java"

when "snowy" :
    -> "clean the car then build snowman, drink hot chocolate, and code java"

when "windy" :
    -> "Get ready for power loss, fly a kite, and code java"

anything else:
    -> "just keep coding java"
        */

        String weather = "warm";
        if (weather.equals("sunny")) {
            System.out.println("Go to park, hiking, and coge java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + "Stay home,drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + "clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println("Get ready for power loss, fly a kite, and code java");
        }else{
            System.out.println("Just keep coding java");

        }


    }
}

