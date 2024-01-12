package com.tujia.classloadertest;

import java.io.InputStream;

public class MyClassloader {

    public static void main(String[] args) {

        // AppClassLoader

        for (int i = 0; i < 10; i++){

            System.out.println(i);
        }


        ClassLoader myclasslocader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {

                try{

                   String fileName = name.substring(name.lastIndexOf("."))+ "class";
                    InputStream resourceAsStream = getClass().getResourceAsStream(fileName);

                    if (resourceAsStream == null){
                        return super.loadClass(name);
                    }

                    byte[] bytes = new byte[resourceAsStream.available()];
                    resourceAsStream.read(bytes);
                    defineClass(name,bytes,0,bytes.length);

                }catch (Exception ex){
                    System.out.println("name = " + name);
                }

                return super.loadClass(name);
            }
        };

    }
}
