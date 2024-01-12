package com.tujia;

/**
 * Created by lidongw_1 on 2018/8/17.
 */
public class AddSymbolsTest {

    public static void main(String[] var0) {
        int i  = 0;
        while (++i < 5){
            System.out.println(i);
            i = Math.min(i, 8);
            System.out.printf("dd" + i);
        }
    }

}
