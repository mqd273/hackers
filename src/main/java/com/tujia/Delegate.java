package com.tujia;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/**
 * Created by lidongw_1 on 2019/2/19.
 */
public class Delegate {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Consumer sss = p -> {
            System.out.println("sss");
        };
        Delegate d = new Delegate();
        Method dd = d.getClass().getMethod("dd",String.class,String.class);
        a(d,dd,"a","b");

    }

    public void dd(String a,String b) {
        System.out.println("dd" + a + "-" + b);
    }

    public static void a(Object obj,Method method ,Object... args ) throws InvocationTargetException, IllegalAccessException {
        method.invoke(obj,args);
    }
}
