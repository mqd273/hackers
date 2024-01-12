package wang.lidong.jvm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:lidongw_1
 * @Date 2022/4/18
 * @Description: TODO
 **/
public class OutsideOfHeap {


    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocateDirect(1024*1024);
        List<Object> ll = new LinkedList<>();
        ReferenceQueue rq = new ReferenceQueue();
        WeakReference wrf = new WeakReference(buffer, rq);

        int i = 0;
        for (; ; ) {

            //会内存溢出  Direct buffer memory
            ll.add(new SoftReference(ByteBuffer.allocateDirect(1024*1024*10)));
            //不会内存溢出 弱
          //  ll.add(new WeakReference(ByteBuffer.allocateDirect(1024*1024*10), new ReferenceQueue()));

            //虚
            ll.add(new PhantomReference(ByteBuffer.allocateDirect(1024*1024*10), new ReferenceQueue()));


            //会内存溢出
          //ll.add(ByteBuffer.allocateDirect(1024*1024*10));
            System.out.println(ll.size());
        }
    }
}
