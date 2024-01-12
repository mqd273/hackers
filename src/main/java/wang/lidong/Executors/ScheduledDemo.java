package wang.lidong.Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/**
 * @Author:lidongw_1
 * @Date 2022/4/27
 * @Description: TODO
 **/
public class ScheduledDemo {

    public static void main(String[] args) {


        int[] a = new int[10];

        ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return null;
            }
        });

    }
}
