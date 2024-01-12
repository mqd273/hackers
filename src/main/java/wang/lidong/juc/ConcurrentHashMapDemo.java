package wang.lidong.juc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:lidongw_1
 * @Date 2022/4/19
 * @Description: TODO
 **/
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {


        ConcurrentHashMap chm = new ConcurrentHashMap(17);

        for (int i = 0 ;i < 18; i++){
            chm.put("key_"+i, i);
        }
        System.out.println(chm.size());
    }
}
