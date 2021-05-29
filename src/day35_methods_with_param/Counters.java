package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(8);
        int num = 99;
        count(num);
        String word = "wooden spoon";
        count(word.length());
        word = "be strong";
        count(word.length());
        printAge(1991);

        int birthYear = 2001;
        printAge(birthYear);
    }

    public static void count(int num){
        for(int i = 0; i <= num; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    /**
     * method name:  printAge
     * @param/input: int year
     * "Birth year: 1991. Age: 38"
     */
    public static void printAge(int birthYear){
        int age = 2021 - birthYear; //calculate age
        System.out.println("Birth year: "+birthYear+ ". Age: "+age);
    }

}
