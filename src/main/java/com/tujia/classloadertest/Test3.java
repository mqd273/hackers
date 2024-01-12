package com.tujia.classloadertest;

/**
 * 类加载
 */
public class Test3 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //Class.forName
       /* Class<?> aClass = Class.forName("com.tujia.classloadertest.MyIsClass");
          Object o = aClass.newInstance();
       */

        //ClassLoader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass1 = systemClassLoader.loadClass("com.tujia.classloadertest.MyIsClass");
        Object o1 = aClass1.newInstance();


    }
}


class  MyIsClass{

    static{

        System.out.println("init MyIsClass");

    }
    public MyIsClass() {
        System.out.println(" instantiation  MyIsClass");
    }
}


