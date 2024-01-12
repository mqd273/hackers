package com.tujia.compare;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by lidongw_1 on 2019/2/26.
 */
public class longTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 999999999;i++){
            if (i > 100){}
           //boolean kk = ();
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        long start1 = System.currentTimeMillis();

        for (int m = 1; m < 999999999; m++){
            if ((long)m > 100L){}
            //boolean kk = ((long)m > 100L);
        }

        System.out.println("耗时：" + (System.currentTimeMillis() - start1));

        Random rd = new Random(System.nanoTime());
        IntStream ints = rd.ints(1, 100);

        System.out.println("耗时：" + ints.findFirst().getAsInt());

        Double a = 2.3666666666666;

        double d = 17222.0188888888888553000;
        double e = 17222.01888888888889551;

        if (d == e){
            System.out.println("dubbo doubleToLongBits 比较 " + Double.doubleToLongBits(d) + "    e:"+ Double.doubleToLongBits(e));
            System.out.println("dubbo string 比较" + String.valueOf(d) + "    e:"+ String.valueOf(e));
        }

        double d1 = 0.0;
        double e1 = 0.0;

        if (d1 == e1){
            System.out.println("dubbo doubleToLongBits 比较 " + Double.doubleToLongBits(d1) + "    e1:"+ Double.doubleToLongBits(e1));
            System.out.println("dubbo string 比较" + String.valueOf(d1) + "    e1:"+ String.valueOf(e1));
        }


        float f = 3.4f;
        float g = 3.4f;

        if (f == g){
            System.out.println("float 比较" + Double.doubleToLongBits(f) + "    e:"+ Double.doubleToLongBits(g));
        }

        if(doubleVo1.a == doubleVo2.b){
            System.out.println("double vo 比较" + Double.doubleToLongBits(f) + "    e:"+ Double.doubleToLongBits(g));
        }
    }

  static class doubleVo1{
        public static double a = 0.0;
    }

   static class  doubleVo2{
        public static double b = 0.0;
    }
}
