package com.tujia.datetimeTest;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

/**
 * Created by lidongw_1 on 2019/3/22.
 */
public class DatetimeM {

    public static void main(String[] args) throws ParseException {


       /* try(int i = 3){

            System.out.println(i);
        }*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

        Date parse = simpleDateFormat.parse("12:30");


        Date date = new Date();

        System.out.println(LocalDateTime.now().toLocalDate());
        String format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date());

        String format1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());

        System.out.println(format);

        System.out.println(format1);


        String format3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(parse);
        System.out.println(format3);


        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());


        SimpleDateFormat format4 = new SimpleDateFormat("HH:mm");
        System.out.println(format4.format(new Date()));



    }
}
