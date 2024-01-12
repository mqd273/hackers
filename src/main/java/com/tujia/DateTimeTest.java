package com.tujia;

import com.google.common.collect.Lists;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by lidongw_1 on 2018/8/1.
 */
public class DateTimeTest {

    public static void main(String... arg) {

     /*   DateTime dateTime = new DateTime();
        Calendar instance = Calendar.getInstance();
        Date d = new Date("100");
        System.out.println(d);*/


        System.out.println(" dd:" + (8-16));

        double   f   =   111231.5585;
        BigDecimal b   =   new   BigDecimal(f);
        double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();

        System.out.println(f1);

        System.out.println( Lists.newArrayList(-1L,20001L,20005L,20007L,20006L).contains(-1L));

        System.out.println( Lists.newArrayList(-1L,20001L,20005L,20007L,20006L).contains(666L));

        System.out.println(System.currentTimeMillis() - 1557210677036L);

        System.out.print(DateTime.now().plusDays(-30).toDate());





    }
}
