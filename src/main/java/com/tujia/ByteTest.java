package com.tujia;



import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lidongw_1 on 2018/8/7.
 */
public class ByteTest {


    public static void main(String[] arg){


        ArrayList<Integer> integers1 = Lists.newArrayList(1, 2, 3);

        Integer[] integers2 = integers1.toArray(new Integer[]{});

        System.out.println(integers2);




        ConcurrentHashMap hs =new ConcurrentHashMap<Integer,Object>();
        for (int i = 0; i< 10; i ++){
            hs.put(i, java.lang.String.valueOf(i));
        }

        Set<Map.Entry<Integer,Object>> set1 = hs.entrySet();


        set1.forEach( o -> {
            System.out.printf("key: %d  value : %s size: %d ",o.getKey() ,o.getValue(),set1.size());
            System.out.println();
            System.out.printf("delete key: %d ",((Map.Entry<Integer,Object>)set1.toArray()[3]).getKey());
            System.out.println();
            boolean remove = set1.remove(set1.toArray()[3]);

        });


        System.out.println("---------------------------------------------");
        ArrayList<Integer> integers = Lists.newArrayList(10);

        for (int i = 0; i< 10; i ++){
            integers.add(i);
        }

        integers.forEach(p->{
            System.out.printf("key: %d ", p);
            System.out.println();
            System.out.printf("delete key: %d ", integers.get(3));
            System.out.println();
            Integer remove = integers.remove(3);

        });


        byte[] bs = new byte[10];
        bs[0]= 'i';
        bs[1] = ' ';
        bs[2] = 'a';

        String s = String.valueOf(bs);



        System.out.println(s);

        System.out.println(bs.toString());

    }
}
