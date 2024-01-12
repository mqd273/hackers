package com.tujia;

/**
 * Created by lidongw_1 on 2018/7/26.
 */
public class EqualTest {

    public static void main(String... arg){

        int i = 100000;
        Integer I = new Integer(100000);

        short a=2;
        short b=3;
        a=(short) (a+b);
        a+=b;

        System.out.println("i == Integer ?" + (i == I));
        System.out.println("i equal Integer ?" + (I.equals(i)));


        String s = "aaa";
        String s2 = null;

        System.out.println(s.equals(s2));



    }
}
