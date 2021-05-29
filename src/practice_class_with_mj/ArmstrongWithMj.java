package practice_class_with_mj;

//public class ArmstrongWithMj {
//    public static void main(String[] args) {
//
//        int num = 153;
//    }
//    public static boolean isArmstrong(int n){
//        //num = 153
//        //HOw can I know without casting find digit?
//        // num = 153 /10
//        // n  /10 = 15
//        //15/10 = 1
//        //1/10 = 0.1 = 0
//
//        int copyNum = n;
//        int count = 0;
//        while(copyNum >= 0){
//            count++;
//            n /= 10;
//        }
//        copyNum = n;
//        //123 %10 = 3 == 13*10 =120 +3
//        int armstrong = 0;
//        while (copyNum > 0){
//            int lastDigit = copyNum %10; // ==3
//            armstrong +=Math.pow(lastDigit, count); //lastDigit (power) count == 3(power)4
//            copyNum /= 10;
//
//        }
//    // copuNum =153  copy Num = 15
//        //count = 3
//        //lastDigit= 3
//        //Armstrong = 27
//        if(n == armstrong){
//
//       // }
//  //  }
//
//
////}
