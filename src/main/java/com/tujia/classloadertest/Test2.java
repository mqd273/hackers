package com.tujia.classloadertest;


import java.util.Random;

public class  Test2{
    public static void main(String[] args) {
        System.out.println(FinalTest.fsa);
       // System.out.println(FinalTest.fssa);
       // System.out.println(FinalTest.sa);
    }
}

class FinalTest {

    public static  int  sa = 1;
    public final static int fsa = new Random().nextInt();
    public final static String fssa = "666666";
    static {
        System.out.println("final static block");
    }
}


