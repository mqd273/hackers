package wang.lidong.nio.buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author:lidongw_1
 * @Date 2022/4/3
 * @Description: TODO
 **/
public class BufferDemo {


    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(16);

        /** 只读缓存区 */
        ByteBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();


        /** 内存映射文件IO */


    }

    /**
     * 直接缓存区 加快IO的速度
     *
     */
    private void directBuffer() throws FileNotFoundException {

        FileInputStream inputStream = new FileInputStream("");

        FileOutputStream outputStream = new FileOutputStream("");

        ByteBuffer directBuffer = ByteBuffer.allocateDirect(1024);
    }

    /**
     * @throws FileNotFoundException
     *
     * 内存映射文件操作
     */
    private void mappedBuffer() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("","fw");

        FileChannel channel = raf.getChannel();

        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);



    }
}
