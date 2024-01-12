package com.tujia;

import java.time.Instant;
import java.util.Date;

/**
 * Created by lidongw_1 on 2018/8/21.
 */
public class DateTest {

    public static void main(String... arg) {
        long time = new Date().getTime();
        System.out.println(time);

        Date from = Date.from(Instant.ofEpochMilli(time));
        System.out.println(from);
        try {
            // throw new ArgumentException("some operation that throws an exception");
            String s = "blah";
        } catch (Exception e) {
            System.out.println();
        }

        System.out.println("nihao");
    }
}
