package wang.lidong.juc;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:lidongw_1
 * @Date 2020/11/10
 * @Description: TODO
 **/
public class ReentrantLockTest {

    private static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        // System.out.println(lock.isFair());

        Thread thread = new Thread(() -> {

            mm(false);
            System.out.println("线程ID : " + Thread.currentThread().getId() + " getQueueLength : " + lock.getQueueLength());
            mm(true);
            System.out.println("线程ID : " + Thread.currentThread().getId()
                    + "thread hold count :" +lock.getHoldCount());
        });

        Thread thread1 = new Thread(() -> {

            System.out.println("线程ID : " + Thread.currentThread().getId() + " getQueueLength : " + lock.getQueueLength());
            mm(true);

          /*  mm();
            System.out.println("线程ID : " + Thread.currentThread().getId()
                    + "thread hold count :" +lock.getHoldCount());
            mm();*/
        });


        thread.start();

        thread1.start();


    }


    private static void mm(boolean freeLock) {
        lock.lock();
        try {
            System.out.println("线程ID:" + Thread.currentThread().getId());
            System.out.println("线程ID:" + Thread.currentThread().getId() + "  hold count :" + lock.getHoldCount());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (freeLock) {
                lock.unlock();
                while (lock.isLocked()) {
                    lock.unlock();
                }
            }
        }
    }
}
