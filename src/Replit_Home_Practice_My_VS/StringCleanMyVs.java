package Replit_Home_Practice_My_VS;

public class StringCleanMyVs {
    public static void main(String[] args) {
        String text = "0ne two three two";
        String[] strArr = text.split(" ");
        String goodWord = "";
        for(int i = 0; i <strArr.length-1; i++){
            for(int j = 0; j < strArr.length-1; j++){
                if(strArr[i] == strArr[j]) {
                    goodWord += strArr[j];
                   // if(strArr.
                }
            }

        }
        System.out.println(goodWord);

    }


}
