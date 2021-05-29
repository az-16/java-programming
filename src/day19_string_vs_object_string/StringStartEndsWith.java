package day19_string_vs_object_string;

public class StringStartEndsWith {
    public static void main(String[] args) {
        String word = "Smart phone";
        System.out.println(word.startsWith("S")); //true
        System.out.println(word.startsWith("a")); //false
        System.out.println(word.startsWith("m"));// false
        System.out.println(word.startsWith("Sma")); //true
        System.out.println(word.startsWith("smart"));//false case sensitive

        System.out.println((word.startsWith("Smart") && word.endsWith("phone")));
        System.out.println(word.endsWith("phone")); //true

        String name = "Nazbiyke";
        if(name.endsWith("ke")){
            System.out.println("Maybe this is female name");

        }
        /**
         * Mr.-> Man
         * Dr -> Doctor
         * Mrs -> Married woman
         * Ms->Single woman
         *Sr -> Senior
         * */

        String firstName = "Dr. Aizat";
        if (firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(firstName.toLowerCase().toUpperCase().startsWith("Mrs")) {
            System.out.println("Mrs Aizat");
        }else if(firstName.startsWith("Dr")) {
            System.out.println("Doctor Nazbiyke");
        }else if(firstName.startsWith("Sr")){
            System.out.println("Senior Peter");

        }
        /**
         * String url = "https://www.stackoverflow.com"
         * .com -> "Commercail website"
         * .ru -> "Russian website"
         * .gov -> government website
         * .edu - > "Education website"
         * .org -> "Organization website"
         */
            String url = "https://www.charity.water.com"; //we can change here
            if(url.endsWith(".com")) {
                System.out.println("Commercial website");
            }else if (url.endsWith(".ru")) {
                System.out.println("Russian website");
            }else if (url.endsWith(".gov")) {
                System.out.println("Government website");
            }else if (url.endsWith(".edu")) {
                System.out.println("Educational website");
            }else if (url.endsWith(".org")){
                System.out.println("Organization website");
            }
    }
}