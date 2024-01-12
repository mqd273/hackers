package wang.lidong.juc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import static java.util.concurrent.Executors.*;

/**
 * @Author:lidongw_1
 * @Date 2020/10/9
 * @Description: TODO
 **/
public class CountDownLatchTest {
   static Logger logger = LoggerFactory.getLogger(CountDownLatchTest.class);
    static AtomicInteger count = new AtomicInteger(100);
    private static int threadTotal = 200;

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(101);
        ExecutorService executorService = newScheduledThreadPool(20);
        Semaphore semaphore = new Semaphore(threadTotal);
        for (int i = 0; i < 102; i++) {
            executorService.execute(()->{
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                    logger.warn(e.getMessage());
                }
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        executorService.shutdown();
        System.out.println("count:" + count);
    }

    private static void add(){
        count.addAndGet(1);
        System.out.println("i:" + count);
    }
}
