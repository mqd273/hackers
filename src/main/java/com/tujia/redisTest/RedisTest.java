package com.tujia.redisTest;

import java.math.BigDecimal;

/**
 * Created by lidongw_1 on 2019/4/22.
 */
public class RedisTest {

   /* static Tedis tedis = getTedis();

    public static void main(String[] args) throws InterruptedException {


        BigDecimal bigDecimal = new BigDecimal(0.0);

        if(bigDecimal.equals(BigDecimal.ZERO)){
            System.out.println(BigDecimal.ZERO);
            System.out.println("true  成立");
        }

        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.0);
        if(! bigDecimal1.equals(BigDecimal.ZERO)){
            System.out.println(bigDecimal1);
            System.out.println("bigDecimal : 0.0 != 0");
        }

        if(bigDecimal1.compareTo(BigDecimal.ZERO) == 0 ){
            System.out.println(bigDecimal1);
            System.out.println("bigDecimal : 0.0 != 0");
        }


        long setnx = 0L;


      *//*  Boolean nx = tedis.exists("nx");

        System.out.println("nx 是否存在：" + nx);

        System.out.println("nx进入" + setnx);
        setnx = tedis.setnx("nx", "aaa");
        System.out.println("nx 结果" + setnx);
        System.out.println("redis nx结果" + tedis.get("nx"));*//*


        for (int i = 0; i < 10 ; i++) {

            System.out.println("ex进入");
            String setex = tedis.setex("ex", 10, "aaa");
            System.out.println("ex 结果" + setex);
            Thread.sleep(1000*9);
            System.out.println("sleep 9 seconds redis ex结果" + tedis.get("ex"));

            Thread.sleep(1000*9);

            System.out.println("sleep 18 seconds redis ex结果" + tedis.get("ex"));
        }


*//*
        String lockResult = tedis.set("lock", "1", "nx", "px", 1000000);
        System.out.println("第一次设置 lock result " + lockResult);
        lockResult = tedis.set("lock", "1", "nx", "px", 1000000);
        System.out.println("第二次设置 lock result " + lockResult);
*//*

    }


    private static Tedis getTedis() {
        //Tedis(String namespace, String password, int connTimeout, int soTimeout, int maxAttempts, int maxTotal, int maxIdle, int minIdle, String zkAddress) {
        Tedis tedis = new Tedis(
                "tns_product_new", "0xso28051mp", 3000, 3000, 3, 3000, 40, 8, "10.2.98.128:2181,10.2.98.129:2181,10.2.98.130:2181");
        return tedis;
    }*/
}
