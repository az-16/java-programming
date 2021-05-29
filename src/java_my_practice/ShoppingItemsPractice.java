package java_my_practice;

public class ShoppingItemsPractice {
    public static void main(String[] args) {
        //                   0          1          2
        String[] items = {"Ipone", "laptop", "Camera"};
        double[] prices = {999, 1200.0, 559.60};
        int[] itemIDs = {1234, 1987, 12786};
        //how can I find index of laptop
        // we gonna use for loop and if
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("laptop")) {            //System.out.println(i + "-" +items[i]);
                System.out.println("laptop found at index = " + i);   //I have to find index of laptop
                break;

            }

        }
        System.out.println("---Set boolean to true if first 'Camera' is found");
        boolean cameraExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("Camera")) {
                cameraExists = true;
                break;
            }
        }
        System.out.println("cameraExists - " + cameraExists);

        if (cameraExists) {
            System.out.println("We have a camera");
        } else {
            System.out.println("We don't have a camera");
        }
        System.out.println("-----Print a report of each item-----");
        /**
         * iphone - $999 - #1234
         * laptop - $1200.0 - #1987
         * camera - $559.60 - #12786
         */
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);

        }
            System.out.println("Look for 'Iphone' print with all details");
            for (int i = 0; i < items.length; i++) {
                if (items[i].equals("Iphone")) {
                    System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                    break; //stop searching after Iphone founding

                }
            }
        }
    }
