package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
                        //   0          1          2            3       4         5
        String[] items  = {"Shoes",  "Jacket", "Gloves", "Airpods", "iPad",     "iphone 11 case" }; //those are not sorted. that we use for loop
        double[] prices = {99.99,     150.0,       9.99,      250.0 ,  439.50,   39.99};
        int[] itemIDs =   {12345 ,    12346,     12347,      12348,     12349,    12350};

        // can u tell me how much you paid for "ipad"? 439.50. both same position in arryas

      // Shuffle the values in array using random class. Try to your own
       // int[] itemIDs = {12345 ,    12346,     12347,      12348,     12349,    12350}

        System.out.println("---------FIND first INDEX OF 'Gloves' in items array--------");

        //use for loop with condition b/c we need to index number
       // int indexOfGloves = -1;
        // starting with simple
        for(int i = 0; i < items.length; i++){
            if(items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " +i);
                break; // it is very helpfull. if condition is false it is not stop. when getting true will exit.
               // System.out.println(i + " - " + items[i]);
            }

        }
        System.out.println("-----Set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for(String item : items) {
            if(item.equalsIgnoreCase("iPad")) {
                iPadExists =  true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);
        if(iPadExists){
            System.out.println("We bought the iPad");
        } else {
            System.out.println("We forgor the iPad :(");
        }
        System.out.println("----Print a report of each shopping item----");
        /**
         * shoes - $99.99 - #12345
         * ........
         * iphone 12 case - $39.99 - #12350
         */
            for (int i = 0; i < items.length; i++){
                System.out.println(items[i]+ " - \t$" +prices[i]+" - \t#"+itemIDs[i]);
            }
        System.out.println("-----Look for 'Jacket' in items and print all details----");
        /**
         * Jacket - $150.0 - #12346
         */
        for (int i = 0; i <= items.length; i++){
            if (items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] +" - $" + prices[i] +" -#" +itemIDs[i]);
                break; //stop searching after jacket is found
            }
        }
    }

}
