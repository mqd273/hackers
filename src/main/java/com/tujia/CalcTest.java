package com.tujia;

import java.io.IOException;

/**
 * Created by lidongw_1 on 2018/7/2.
 */
public class CalcTest {


    public static void main(String... arg) throws IOException {

        short s = 1;
        s += 1;


        double i = 1, m = 1, n = 1;
        long count = 10000000L;
        for (;i<count ; i ++){
            System.out.println("i" +i);


            for (;m < count; m++ ){
                for (;n < count ; n++){
                    double j = i/(m + n)  + m/(i+n)  + n/(i+m) ;
                    if (j == 4L){
                        System.out.println("i/(m+n) = " + i/(m+n));
                        System.out.println("i%(m+n) = " + i%(m+n));
                        System.out.println("m/(i+n) = " + m/(i+n));
                        System.out.println("m%(i+n) = " + m%(i+n));
                        System.out.println("n/(i+m) = " + n/(i+m));
                        System.out.println("n%(i+m) = " + 11.00/8);

                        System.out.println("j="+j + " i = " + i + " n = " + n + " m = "+ m);
                    }
                }
            }
            Runtime.getRuntime().exec("clear");
        }

        System.out.println("执行完成");
    }

}
