package com.tujia;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * Created by lidongw_1 on 2019/4/28.
 */
public class StopWatchTest {

    public static void main(String[] args) throws InterruptedException {

        Stopwatch sw = Stopwatch.createStarted();

        Thread.sleep(500);
        sw.stop();

        System.out.println(sw.elapsed(TimeUnit.MILLISECONDS));
        sw.reset();
        sw.start();
        Thread.sleep(500);
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.MILLISECONDS));
        Thread.sleep(500);

        System.out.println(sw.elapsed(TimeUnit.MILLISECONDS));


        System.out.println("hashCode :" + new Integer(40171215).hashCode());

        Object obj = new Integer(40171215);

        System.out.println("hashCode object :" + obj.hashCode());

        System.out.println("673961151037696 >> 24 : " + (673961151037696L >> 24) );

        System.out.println("(673961151037696 >> 24)&15 : " + ((673961151037696L >> 24)&15) );

    }
}
