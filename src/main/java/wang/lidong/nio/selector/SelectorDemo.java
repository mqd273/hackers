package wang.lidong.nio.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.nio.charset.StandardCharsets;
import java.util.Set;

/**
 * @Author:lidongw_1
 * @Date 2022/4/3
 * @Description: 多路复用器
 *
 * 1、一个选择器可以管理过个通道
 *  selector(1) : channel (N)
 * 2、 轮询
 *  主动查询的一个状态： 通道读就绪、通道写就绪
 *  selectableChannel 才可以被 selector 复用
 *
 *  通道和选择器是通过注册实现的
 *
 *  订阅 - 消费模式
 *
 *  channel 必须处于非阻塞模式
 *
 **/
public class SelectorDemo {

    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();

        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.configureBlocking(false);

        //绑定链接
        channel.bind(new InetSocketAddress(9999));

        /*将通道注册到选择器*/
        channel.register(selector,SelectionKey.OP_ACCEPT| SelectionKey.OP_READ);

        /*查询已经就绪的通道*/
        for (SelectionKey key : selector.selectedKeys()) {

            ServerSocketChannel chan = (ServerSocketChannel)key.channel();

            if (key.isAcceptable()) {

            }else if (key.isReadable()){

            }else if (key.isWritable()){
                ByteBuffer buffer = ByteBuffer.allocate(100);
                buffer.put("abc".getBytes(StandardCharsets.UTF_8));
                SocketChannel accept = chan.accept();
                accept.write(buffer);
            }

            key.cancel();

        }

        /*唤醒*/
        selector.wakeup();

    }

    void  client(){
        Socket socket = new Socket();
    }
}
