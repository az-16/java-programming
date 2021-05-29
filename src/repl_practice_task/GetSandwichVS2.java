package repl_practice_task;

import java.util.Scanner;

public class GetSandwichVS2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //str contains bread
        //at least two bread
        // to find middle we can use substring
        if(str.contains("bread")){
            int firstIndex = str.indexOf("bread");
            int lastIndex = str.indexOf("bread");
            if(firstIndex  != lastIndex){
                System.out.println("nothing");
            }else{
                //we have still least of 2 bread.
                //01234567891011
                //breadjambread
                System.out.println(str.substring(str.indexOf("bread")+5, str.indexOf("bread")));
            }
        }
    }
}
