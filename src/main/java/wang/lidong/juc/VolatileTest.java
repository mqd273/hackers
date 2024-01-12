package wang.lidong.juc;

import java.util.Optional;
import java.util.Set;

/**
 * @Author:lidongw_1
 * @Date 2020/12/30
 * @Description: TODO
 **/
public class VolatileTest {

    private static boolean flag = false;
    public static void main(String[] args) {
        //Optional<Set<Object>> of = Optional.of(Set.of());
        //
        //if (of.isPresent()) {
        //    Set<Object> objects = of.get();
        //    System.out.println(objects.isEmpty());
        //}
        //
        //
        //for (int i = 1; i < 10; i++){
        //
        //    System.out.println("i = " + i);
        //    for (int m = 20; m < 30; m++){
        //        break;
        //    }
        //}



        Thread thread = new Thread(() -> {
            while (true){
                if (flag) {
                    System.out.println("flag");
                    break;
                }
            }
            System.out.println("");
        });

        thread.start();

        Thread thread1 = new Thread(() -> {
            flag=true;
        });

        thread1.start();

        System.out.println("线程执行完成");
    }
}
