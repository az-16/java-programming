package day41_arrayList;
import java.util.ArrayList;
public class CitiesList {
    public static void main(String[] args) {
        //declare arrayList  alt/option +enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to ArrayList -> add methods
        cities.add("Chicago"); //it has 0 index
        cities.add("Las Vegas"); //1
        cities.add("Adana"); //2
        cities.add("LA"); // 3
        cities.add("New York"); //4
        //we can also add differently
        //add Ashgabat to 0 index
        cities.add(0, "Ashgabat");
        cities.add(4, "Kyrgyzstan");
        //print all values in same line
        System.out.println(cities);

        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));

        //find last index using size()-1 size means how many
        System.out.println("Last city = " + cities.get(cities.size()-1)); //instead of length we use size

        //print count of items in ArrayList
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the");

        //for loop and print all values in same line
        for(int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");    //in ArrayList we can read with get
            //print half of the cities we can /2
            //for(int i = 0; i < cities.size()/2; i++) {
        }
        System.out.println();
        //for each loop work with collection Array and ArrayList
        for(String city :cities) {
            System.out.println(city +" ");
        }
        System.out.println();
        //how we remove or delete item from ArrayList (one item)
        //1) remove using index. delete value at index 3
        cities.remove(3);
        //2) remove using object/value
        cities.remove("New York");
        System.out.println("after remove = " +cities);

         //delete /remove all values from list
        cities.clear();
        //make sure it is clear
        //1) print it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is empty");
        }
    }

}
