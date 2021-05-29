package day42_arrayList;
import javax.xml.stream.events.Characters;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n')); //we can write away with asList
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        //find count of a in letters
        System.out.println(Collections.frequency(letters, 'a')); //frequency is how many times 'a' repeat

        //we can store too
        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        //this is gives max Char
        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replaceAll = " + letters);


    }
}
