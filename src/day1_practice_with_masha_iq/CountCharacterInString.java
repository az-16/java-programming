package day1_practice_with_masha_iq;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacterInString {
    /**
     * How count count Occurences of EACH characters in String?
     *Intput: aaa bbb ccc ee f
     * Output: a=3, b=3, c=3, e=2, f=1;
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String characters = scan.nextLine(); //aaa bbb ccc ee f

        //before converting character into Array we have to first replace
        //characters=characters.replace(" ","");

        // convert String into the char Array to separate the character
        char [] arr = characters.toCharArray(); //character Array
        //apply the logic
        int count = 0;
        /**
         * A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most
         * one value. It models the mathematical function abstraction.
         * The Map interface includes methods for basic
         * operations (such as put, get, remove, containsKey, containsValue, size, and empty), bulk operations
         * (such as putAll and clear), and collection views (such as keySet, entrySet, and values).
         * The Java platform contains three general-purpose Map implementations: HashMap, TreeMap, and LinkedHashMap.
         */

        Map<Character,Integer>map=new TreeMap<>();

        for(int i = 0; i < arr.length; i++) {
            count=0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            //store char and count. To store key and value we have to take support of the Map
            //put method mapping String values to int keys
            map.put(arr[i], count);
        }
        System.out.println(map);
    }
}
