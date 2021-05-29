package day37_methods_overLoading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hello", 4, '|'));
        System.out.println(repeatString("hi", 3, '~'));
        System.out.println(repeatString("I can do it!", 3, '*'));
    }

    public static String repeatString(String word, int times, char delimiter) {
        String retValue = "";
        for (int i = 1; i <= times; i++) {
            //take care of last delimiter:
            if (i == times) { //if last iteration
                retValue += word; //add only word by itself
            } else {
                retValue += word + delimiter;
            }

        }
        return retValue;
    }
}
/*
add new method:
    repeatString
params:
    String word, int times, char delimiter
Return type: String
it builds the string and returns
repeatString("java", 3, '|');
                    => "java|java|java"
repeatString("hi", 5, '~');
    => "hi~hi~hi~hi~hi"


 */