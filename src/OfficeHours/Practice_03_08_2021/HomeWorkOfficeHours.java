package OfficeHours.Practice_03_08_2021;

import org.w3c.dom.ls.LSOutput;

public class HomeWorkOfficeHours {
    public static void main(String[] args) {


    /*Analyze the following without intellij. Calculate the output step by step

    int a = 5; // 5
    int b = a++ + a-- + a * 2 + a + ++a;

What is the value of a and b?

    */

    int a = 5;
    int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println(b);
        System.out.println(b);

        /*
        Analyze the following without intellij. Calculate the output step by step

    int a = 200;
    int b = -a++ + - --a * a-- % 2 + b;

What is the value of a and b?
         */

      // int a = 200;
       // int b = -a++ + - --a * a-- % 2 + b;
        //System.out.println();

        int f = 10;
        int d = f-- + f-- + f * 5;
        System.out.println(d);

        int k = 4;
        int l = k + k + k + k--;
        System.out.println(l);
}
}

