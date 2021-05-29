package practice_class_with_mj;
import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        // no behavoir means we can use after the object

        // look always the left side of question:

        Integer i = new Integer(52);
        int n = Integer.parseInt("23"); //here we converting primitive to object

        //---------------------------------------------



        //How to declare an ArrayList:
        //there 3 ways to declare
        ArrayList<String> myArray = new ArrayList<>(); //left side is mandatory //here size array = 0;  capacity = 10
        ArrayList<String> myArray2 = new ArrayList<>(100); //capacity = 100; size = 0;
        System.out.println("myArray2.size()= " + myArray2.size());
        List<String> myArrays3 = new ArrayList<>();

        //add some value directly to my ArrayList
       ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("nums = " + nums);
       // nums = Arrays.asList(2,3,4,5,6);
       // System.out.println("nums = " + nums);

        List<Integer> nums1 = new ArrayList<>();
        nums1.addAll(Arrays.asList(6, 7, 8, 9));
        System.out.println("nums1 = " + nums1);

        nums.addAll(Arrays.asList(8, 9));
        System.out.println("nums1 = " + nums1);

        //=========================================
        //methods
        //.add()
        //methods has signature (Integer)
        nums.add(2);  // it means add number 2 to the end of my ArrayList
        System.out.println("nums = " + nums);
        System.out.println(nums.add(3)); //true. it means 3 ends of the method
        System.out.println("nums = " + nums);
        //not only add 3 at at the end, but it will return true

        nums.add(3, 5); // add 5 to index 3
        System.out.println("nums = " + nums);

        //System.out.println(nums.add(5, 6)); this method void does not return value. just adding specific index

        //How can read index in my ArrayList?
        // .get() -is custom method which accept Integer. return. It will return Integer
        System.out.println(nums.get(2)); // this return method

        // .remove() why paranthesis. bc they are method
        nums.remove(0); //its going to remove value of index 0// duty of this method remove the value but it will return value
        System.out.println(" nums= " + nums );
        System.out.println(nums.remove(1));
        //it will return the original value of index
        System.out.println(" nums= " + nums );

        nums.remove("2"); // "2" ==2
        System.out.println(nums.remove("2")); // printed false
        System.out.println("nums = " + nums);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("mj", "mohommad", "javad", "Semati"));

        words.remove(1);
        System.out.println("words = " +words);
        words.remove("javad");
        System.out.println("words = " + words);
        words.remove("javad");
        System.out.println("words = " + words);

        //this method not only remove "mj", but also return true
        System.out.println(words.remove("mj"));
        System.out.println("words = " + words);

        //tricky question be careful
        if(words.remove("mj")) {
            System.out.println("hello guys");
        }else
            System.out.println("hello folks");
        // isEmty() = it means return boolean
        System.out.println(words.isEmpty());

        //.Contain() = return ture or false if the valye is contain or not
        words = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi"));
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList("mj", "mohommad", "javad", "Semati"));
        System.out.println(words);

        System.out.println(words.contains("apple"));
        System.out.println(words.containsAll(words2));

        // most important method is
        // .set()
        System.out.println(words.set(2, "orange"));  //this is custom method that accept 2 methods
        System.out.println("words = " + words);










    }
}
