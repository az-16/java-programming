package day38_methods;

public class StringUtilsGuava {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"strong\") = " + isNullOrEmpty("Strong"));
        String word = null;
       // System.out.println(word.toUpperCase());

        System.out.println("isNullOrEmty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmty(word) = " + isNullOrEmpty(word));


    }
        public static boolean isNullOrEmpty(String str){
       // we can do with to ways
       return str == null || str.isEmpty();
//        //2 way
//            if(str == null || str.isEmpty()){
//                return true;
//            }
//            return false;

    }

    }

