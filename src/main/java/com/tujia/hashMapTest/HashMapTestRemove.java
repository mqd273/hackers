package com.tujia.hashMapTest;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by lidongw_1 on 2019/1/3.
 */
public class HashMapTestRemove {

    public static void main(String[] args) {
 /*       ConcurrentHashMap hs = new ConcurrentHashMap<Integer, Object>();
        for (int i = 0; i < 10; i++) {
            hs.put(i, java.lang.String.valueOf(i));
        }

        Set<Map.Entry<Integer, Object>> set1 = hs.entrySet();

        set1.forEach(o -> {
            System.out.printf("key: %d  value : %s", o.getKey(), o.getValue());
            set1.remove(3);
        });*/





        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i + "", i + "");
        }


        String s2 = map.get(20);

        System.out.println("s2 : " + s2);

        long l = System.currentTimeMillis();
        for (String s : map.keySet()) {
            String s1 = map.get(s);
        }
        System.out.println(System.currentTimeMillis() - l);
        //Set<String> strings = map.keySet();

        //Set<Map.Entry<String, String>> entries = map.entrySet();

        long l2 = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
        }
        System.out.println(System.currentTimeMillis() - l2);

    }
}
