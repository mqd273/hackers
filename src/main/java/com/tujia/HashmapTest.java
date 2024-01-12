package com.tujia;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * Created by lidongw_1 on 2018/7/11.
 */
public class HashmapTest {


   static HashMap hm = new HashMap();


    public static void main(String... arg) throws NoSuchFieldException {

        System.out.println("初始大小：" + hm.size());

        hm.computeIfAbsent(5,(a)->{
            System.out.println(a);
            return  1;
        });

        Class<? extends HashMap> aClass = hm.getClass();

        Field table = aClass.getDeclaredField("table");




        for(int i = 0 ; i<17; i++){
           hm.put(i,i);

           System.out.println("遍历第 " +  i +" 次， hashmap size : " + hm.size());
       }
    }

}
