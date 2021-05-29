package GroupMeetingTasks;

import org.w3c.dom.ls.LSOutput;

public class GroupActivity {
    public static void main(String[] args) {


    /*
    Coding task to practice with:
[Merge Strings]
User is given two Strings, which could vary in length, merge these Strings so these Strings are
combined into one String. Any extra characters from mismatched length String are at the end.
Ex:
String one = abc
String two = defgh
Output:
adbecfgh
Ex:
String one = java
String two = is
Output:
jiasva
_____________________________________________________
     */

        String one = "abc";
        String two = "defgh";
        int maxValue = Math.max(one.length(), two.length());
        System.out.println(maxValue);
        String result = "";

        for(int i = 0; i <maxValue; i++){
            if(i<one.length()){
                result += one.charAt(i); //a
            }
           if(i<two.length()){
               result += two.charAt(i);//ad
           }

        }
        System.out.println(result);

    }
}