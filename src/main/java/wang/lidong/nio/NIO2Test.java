package wang.lidong.nio;

import com.tujia.App;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

/**
 * @Author:lidongw_1
 * @Date 2021/12/14
 * @Description: TODO
 **/
public class NIO2Test {

    public static void main(String[] args) throws IOException {

        URL url = App.class.getResource("/a.txt");

        File file = new File(url.getPath());
        FileChannel fc =new FileInputStream(file).getChannel();
        StringBuffer sb = new StringBuffer();
        ByteBuffer bbf = ByteBuffer.allocate(1024);


        int offset = 0;
        while (true){
            long read = fc.read(bbf);
            if (read == 0L) {
                break;
            }
          //  sb.append(new String("UTF-8",bbf));
            offset+=1024;
        }

        System.out.println("读取结束");



    }
}
