package com.tujia.compare;

import com.google.common.collect.Lists;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by lidongw_1 on 2019/3/6.
 */
public class DoubleTest {


    public static void main(String[] args) {


        ArrayList<Long> l = Lists.newArrayList(1L,2L);

        String[] strings = l.toArray(new String[l.size()]);

        System.out.println(strings);


        double a = 1.0;

        double b = 1.0;

        System.out.println(Double.valueOf(a).equals(b));
    }
}
