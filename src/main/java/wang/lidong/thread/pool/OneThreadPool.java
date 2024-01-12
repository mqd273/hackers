package wang.lidong.thread.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author:lidongw_1
 * @Date 2021/6/25
 * @Description: TODO
 **/
public class OneThreadPool {


    BlockingQueue<Runnable> taskQueue;


    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();

        taskQueue.put(()-> System.out.println(Thread.currentThread().getName()));

        taskQueue.put(()-> System.out.println(Thread.currentThread().getName() + "2"));

        Runnable take = taskQueue.take();
        take.run();

        int i = taskQueue.remainingCapacity();
        System.out.println("remainingCapacity : " + i);

       // ExecutorService
    }


    public void runnable(){

        System.out.println(Thread.currentThread().getId());
    }



}
