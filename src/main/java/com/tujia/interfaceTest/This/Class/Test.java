package com.tujia.interfaceTest.This.Class;

import java.security.PublicKey;

/**
 * @Author:lidongw_1
 * @Date 2020/2/14
 * @Description: TODO
 **/
public class Test {

    public static void main(String[] args) {

        System.out.println(new ThisTestImpl1());

        System.out.println(new ThisTestImpl2());

    }

   static class ThisTestImpl1 implements ThisTest{

        @Override
        public String toString() {
            return getClassName();
        }
    }

   static class ThisTestImpl2 implements ThisTest{

        @Override
        public String toString() {
            return getClassName();
        }
    }

}

interface  ThisTest{



     default String getClassName(){

         return this.getClass().getName();
     }


}
