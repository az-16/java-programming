package day19_string_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        /*
        STRING MANIPULATION:
    -> using String methods to process the "value"

add new package day19_class_vs_object_strings
add new class StringComparison
main method

String variable city and assign value

equals()
equalsIgnoreCase()
         */

        String city = "Chicago";
        //EQUALS CASE SENSITIVE
        if(city.equals ("Chicago")){
            System.out.println(city.equals("Chicago"));
            System.out.println((city.equals("CHICAGO")));
            System.out.println(city.equals("ChiCago"));
            System.out.println(city.equals("chicago"));
            //EQUALSIGNORECASE() METHOD - CASE INSENSITIVE COMPARISON

            System.out.println(city.equalsIgnoreCase("Chicago"));
            System.out.println(city.equalsIgnoreCase("CHICAGO"));
            System.out.println(city.equalsIgnoreCase("chicago"));
            System.out.println(city.equalsIgnoreCase("chiCago"));
            System.out.println(city.equalsIgnoreCase("Chicago1")); //false
            System.out.println(city.equalsIgnoreCase("Chi cago")); //false. b/c one character  missing. B/C IS NOT SPACE SENSITIVE

            if(city.equals("CHICAGO")){
                System.out.println("equals () true");
            }else{
                System.out.println("equals () false");
            }
            if(city.equalsIgnoreCase("CHICAGO")){
                System.out.println("equalsIgnoreCase () true");
            }else{
                System.out.println("equalsIgnoreCase () false");
            }
        }
    }
    }
