package iq_java_code;

public class RemoveDuplicatesFromString {

    /**
     * 10. Remove duplicates from a string.
     * // removeDup("hello")  -> "helo"
     * // removeDup("apple")  -> "aple"
     * // removeDup("aaaaaa") -> "a"
     * // removeDup("abc")    -> "abc"
     */
    public static void main(String[] args) {
        String word = "aplle";
        String uniq = "";

        for(char each : word.toCharArray()) {
            if(uniq.indexOf(each) != -1){
                continue;
            }else{
                uniq+= each; // (meaning) uniq = uniq +each
            }


        }
        System.out.println(uniq);

    }
}
