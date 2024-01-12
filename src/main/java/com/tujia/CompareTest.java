package com.tujia;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lidongw_1 on 2018/7/12.
 */
public class CompareTest {

    private volatile static Map<String, Integer> userSockets = new ConcurrentHashMap<>();
    public static void main(String... arg){


        userSockets.put("a",1);

        System.out.println(userSockets.get("a"));

        userSockets.put("a",2);

        System.out.println(userSockets.get("a"));



        Long l = new Long(158);
        Integer ig = new Integer(158);

        System.out.println("Long 158 == Integer 158 :" + l.equals(ig) );


        long ll = 158;
        int in = 158;

        System.out.println("long 158 == int 158 :" + (ll == in) );


    }
}
