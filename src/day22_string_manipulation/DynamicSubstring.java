package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        // substring + indexOF
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));
        System.out.println(result.substring(13));
        //find the index of :
       int indexOfColon = result.indexOf(":");
        System.out.println("index of colon = " + indexOfColon);
        System.out.println(result.substring(indexOfColon +1) );

        // now we can combine them into one statement
        System.out.println(result.substring(result.indexOf(":") +1 ));

        String today = "i coded [ASCII] today";
        /**
         * find indexOf [
         * find index ]
         * provide them as start, end index for substring
         * to print java
         */
        int start = today.indexOf("[");
        int end = today.indexOf("]");
      //  System.out.println(today.substring(start, end));
        System.out.println(today.substring(start+1, end));
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));
    }
}
