package com.tujia.collectTest;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:lidongw_1
 * @Date 2020/3/28
 * @Description: TODO
 **/
public class SetTest {


    public static void main(String[] args) {

        ArrayList<Integer> longs = new ArrayList<>(1);
        // longs.add(1L);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            longs.add(i);
            longs.stream().findFirst().ifPresent(SetTest::accept);
        }
        System.out.println("stream is cost time : " + (System.currentTimeMillis()- start));

        ArrayList<Integer> longs2 = new ArrayList<>();
        // longs2.add();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            longs2.add(i);
            if(CollectionUtils.isEmpty(longs2));
            longs2.get(0);
        }
        System.out.println("get is cost time : " + (System.currentTimeMillis()- start1));




        Set<String> hashSet = new HashSet();
        boolean add = hashSet.add(null);

        System.out.println(add);

        System.out.println(hashSet);

    }

    private static void accept(Integer p) {
        if ((p/999999)>0) {
            System.out.print(p );
        }
    }
}
