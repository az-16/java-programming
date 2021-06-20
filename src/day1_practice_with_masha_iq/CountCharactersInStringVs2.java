package day1_practice_with_masha_iq;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharactersInStringVs2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letters = scan.nextLine();
        char [] arr = letters.toCharArray();

        Map<Character, Integer> map = new TreeMap<>();

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count=0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            map.put(arr[i], count);
        }
        System.out.println("Occurence of each character = " + map);
    }
}

