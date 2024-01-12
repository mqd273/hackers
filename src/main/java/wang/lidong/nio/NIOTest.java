package wang.lidong.nio;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author:lidongw_1
 * @Date 2020/11/5
 * @Description: TODO
 **/
public class NIOTest {

   static Integer[] queue = new Integer[10];
   static Comparator<Integer> comparator;
    private static int k;

    public static void main(String[] args) {
       // java.nio.channels.spi.AbstractInterruptibleChannel
        k = 10;
        comparator = Integer::compare;
        for (int i = 6; i >= 0; i--) {
            queue[i] = i+2;
        }

        siftUpUsingComparator(5,3);

        System.out.println(StringUtils.join(queue,','));

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(1);

        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(6);

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try(FileInputStream stream = new FileInputStream(new File(""))){
            FileChannel channel = stream.getChannel();
            int write = channel.write(buffer);

            buffer.limit();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void siftUpUsingComparator(int k, Integer x) {
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            Integer e = queue[parent];
            if (comparator.compare(x, e) >= 0) {
                break;
            }
            queue[k] = e;
            k = parent;
            System.out.println(k);
        }
        queue[k] = x;
    }
}
