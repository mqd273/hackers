package wang.lidong.nio.buffer;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author:lidongw_1
 * @Date 2022/4/4
 * @Description: buffer
 **/
public class Buffer0Demo {

    public static void main(String[] args) {

        ByteBuffer.allocateDirect(10); //直接内存

        ByteBuffer buffer = ByteBuffer.allocate(10);

        buffer.put((byte) 256);

        System.out.println(buffer);


        try(FileChannel f = new FileInputStream("").getChannel();
        FileChannel out = new FileOutputStream("").getChannel();){



        }catch (Exception e){


        }
    }
}
