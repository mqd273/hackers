package com.tujia;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lidongw_1 on 2018/9/19.
 */
public class LongTest {

    public static void main(String[] args) throws NoSuchFieldException {


        LObj lo = new LObj();
        System.out.println("Long:" + (lo.l == null));

        System.out.println("Long:" + (lo.l.equals(0)));


        int i = "IEkMKbHCSBaVJDMUr1F790TI5hSbZ6Jg".hashCode();
        System.out.println(i);
        System.out.println(Math.abs(i)%16 +1);

        List<Long> ls = new ArrayList<>();
        ls.add(1L);
        ls.add(2L);
        System.out.print(ls.get(0));

        int it = 30;

        try {
            System.out.println("原来值：" + it);
            add(it);
            System.out.println("修改后的值：" + it);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer A = 10;


        System.out.print("A : " + A);
    }

    private static void add(Integer i) throws NoSuchFieldException, IllegalAccessException {
        Field value = Integer.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set(i, 300);
    }

    static class  LObj{

        public Long l = 0L;
    }
}
