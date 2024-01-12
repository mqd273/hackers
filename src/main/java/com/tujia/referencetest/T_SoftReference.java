package com.tujia.referencetest;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Queue;

/**
 * @Author:lidongw_1
 * @Date 2020/4/12
 * @Description: TODO
 **/
public class T_SoftReference {



    /**
     * 1、软引用不会被system.gc()回收掉
     *
     * */

    public static void main(String[] args) {


        String key = String.format("%s_%s_%s_%s","dd",11L,22,1);

        System.out.println(key);


        String s = "abc_中国_sss";

        int i1 = s.indexOf("_");

        char[] chars = s.toCharArray();

        byte[] bytes = s.getBytes();




        Long l = Long.valueOf("562835724807379712");
        int i = l.hashCode();
        System.out.println(i);
        System.out.println( l+ ":" + (Math.abs(i)%256 + 1));


        Long hoteId = Long.valueOf("5067238");
        int j = hoteId.hashCode();
        System.out.println("hotel: " + (Math.abs(j)%256 + 1));


        System.out.println(Integer.MAX_VALUE);

        ReferenceQueue queue = new ReferenceQueue();


        /**
         * 
         * */
        SoftReference<byte[]> m = new SoftReference<>(new byte[1024 * 1024 *10]);

        /**
         * 虚引用
         *
         */
        PhantomReference<Object> p = new PhantomReference<>(new Object(), queue);

    }
}
