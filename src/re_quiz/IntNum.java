package re_quiz;

public class IntNum {
    public static void main(String[] args) {
//        int num = -5;
//        System.out.println(num++ + ",");
//        System.out.println(num = 0);
//        System.out.println("," + --num);

//        int a = 10;
//        a = --a + a++ + a-- + a++;
//        System.out.println(a);

        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta.replace('C', 'D');
        System.out.println(ta);

    }
}
