package com.tujia.treadTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;

/**
 * Created by lidongw_1 on 2019/1/9.
 */
public class ThreadPoolTest {


    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,
                10,
                1,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue(10));

        for (int i = 0; i < 12; i++) {
            threadPoolExecutor.execute(intConsumer(i));
            System.out.printf("活跃线程数：%d ", threadPoolExecutor.getActiveCount());
            System.out.printf("task：%d ", threadPoolExecutor.getTaskCount());
            System.out.printf("CompletedTask：%d \n", threadPoolExecutor.getCompletedTaskCount());
            System.out.printf("getQueue().size：%d \n", threadPoolExecutor.getQueue().size());
        }


        Thread thread = new Thread(() -> {
            System.out.println(currentThread().getName());
        });

        thread.join();



        //threadPoolExecutor.shutdownNow();

    }

    private static Runnable intConsumer(int i) {
        return () -> {
            System.out.printf(" 线程ID:%d, i:%d \n", currentThread().getId(),i);
            try {
                Thread.sleep(6000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}
