package wang.lidong.nio.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * @Author:lidongw_1
 * @Date 2022/4/3
 * @Description: 服务端
 **/
public class SelectorDemo2 {

    public static void main(String[] args) throws IOException {


        /*获取通道，绑定主机和端口号*/
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1",8080));

        /*通道切换到非注册模式*/
        socketChannel.configureBlocking(false);
        /*创建buffer*/
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        /* 写入buffer */
        Scanner scanner = new Scanner(System.in);

        /*切换模式  */

        buffer.flip();

        /*写入通道*/

    }

    private void serviceDemo() throws IOException {

        /*1: 获取服务通道*/
        ServerSocketChannel channel = ServerSocketChannel.open();
        /*: 切换为非注册*/
        channel.configureBlocking(false);
        /*创建buffer*/
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        /*绑定端口号*/
        channel.bind(new InetSocketAddress(8080));
        /*获取selector*/
        Selector selector = Selector.open();
        /*6 通道注册到selector*/
        channel.register(selector, SelectionKey.OP_ACCEPT);

        /*就绪*/

        while (selector.select(1000) > 0){

            /**判断通道处于何种类型的操作*/
            for (SelectionKey key : selector.selectedKeys()) {
                /*是否就绪*/
                if (key.isAcceptable()) {

                    //获取连击e

                    //切换非阻塞

                }else if (key.isReadable()){ // 是否就绪可读状态

                    SelectableChannel chan = key.channel();

                    if (chan instanceof SocketChannel) {
                       SocketChannel channel1 =    (SocketChannel) chan;
                       ByteBuffer readBuff = ByteBuffer.allocate(1024);
                       channel1.read(readBuff);

                       readBuff.flip();



                    }



                }
            }

        }

    }
}
