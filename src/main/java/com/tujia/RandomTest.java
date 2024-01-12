package com.tujia;

import java.util.OptionalInt;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by lidongw_1 on 2018/6/29.
 */
public class RandomTest {


    static LongStream rd;

    static {
        rd = new Random(System.currentTimeMillis()).longs(5, 20);
    }

    public static void main(String... arg) {

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(String.valueOf(getRandom()));
            thread.run();
            //  System.out.println(rd.findFirst().getAsLong());
            //  System.out.println(thread.getName() +":"+ getRandom());
            //  System.out.println(rd.findFirst().getAsLong());
            //  rd.close();
        }
        long end = System.currentTimeMillis();

        System.out.println(end - begin);

        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(String.valueOf(getLocalRandom()));
            thread.run();

        }

        long end1 = System.currentTimeMillis();


        ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();

        stringThreadLocal.set("dddd");


        System.out.println(end1 - begin1);

    }

    static long getRandom() {

      /* try {
           Thread.sleep(1);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }*/

        // System.out.println(System.nanoTime());
        // System.out.println(System.currentTimeMillis());

        rd = new Random(System.nanoTime()).longs(5, 8000000);
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rd.findFirst().getAsLong();
    }

    static long getLocalRandom() {

       /* ThreadLocalRandom current = ThreadLocalRandom.current();
        IntStream ints = current.ints(1, 10);
        OptionalInt first = ints.findFirst();
        System.out.println(first.getAsInt());*/

        IntStream ints = ThreadLocalRandom.current().ints(5, 8000000);
        return ints.findFirst().getAsInt();
    }
}
