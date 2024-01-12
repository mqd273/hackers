package com.tujia.reflectClass;

import java.lang.reflect.Field;

/**
 * @Author:lidongw_1
 * @Date 2020/3/2
 * @Description: TODO
 **/
public class InterfaceReflect {

    public static void main(String[] args) throws IllegalAccessException {

        IA ia = new AClass();
        System.out.println("getName:" + ia.getClass().getName());
        System.out.println("getCanonicalName:" +  ia.getClass().getCanonicalName());
        System.out.println("getSimpleName:" + ia.getClass().getSimpleName());
        System.out.println("getTypeName:" + ia.getClass().getTypeName());

        Field[] declaredFields = ia.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            System.out.println(declaredField.getName());
            System.out.println(declaredField.get(ia));
        }


    }



}

interface IA{




}

class AClass implements IA{

    private String name = "name";

    private int age = 123;

}
