package com.tujia.interfaceTest;

/**
 * Created by lidongw_1 on 2018/12/4.
 */
public class MainTest {

    public static void main(String[] args) {

        IAImpl ia = new IAImpl();

        System.out.println(ia.getNum());

        System.out.println(ia.getNum2());

    }
}
