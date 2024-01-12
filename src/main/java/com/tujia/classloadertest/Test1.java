package com.tujia.classloadertest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLClassLoader;
import java.security.cert.Extension;

public class Test1 {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> aClass = Class.forName("java.lang.String");
        System.out.println(aClass.getClassLoader());

     /*   Class<?> aClass1 = Class.forName("com.tujia.classloadertest.Test1$A");
        System.out.println(aClass1.getClassLoader());*/

        Class<?> aClass2 = Class.forName("com.tujia.classloadertest.A");
        System.out.println(aClass2.getClassLoader());

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        Class<?> aClass3 = systemClassLoader.loadClass("com.tujia.classloadertest.A");
        com.tujia.classloadertest.A o = (com.tujia.classloadertest.A)aClass3.newInstance();


        Class<?> aClass4 = systemClassLoader.loadClass("com.tujia.classloadertest.A.b");

    }

    static class A {

        public A() {
            System.out.println("inner class init");
        }
    }
}


class  A{

    static
    {
        System.out.println("inner class init");
    }
    public A() {
        System.out.println("instance A");
    }

    public void method1(){
        System.out.println("");

       // URLClassLoader
      //  java.lang.ClassLoader
    }

}