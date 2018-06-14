package TestSelector;

import sun.nio.ch.FileChannelImpl;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        new Thread(){
            @Override
            public void run(){
                try {
                    server();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                try {
                    client();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        client();
    }
    public static void client() throws IOException, InterruptedException {
        SocketChannel channel = SocketChannel.open();
        Selector selector = Selector.open();
        channel.configureBlocking(false);
        channel.register(selector, SelectionKey.OP_READ);
        //尝试与目的主机建立 TCP 连接
        channel.connect(new InetSocketAddress("127.0.0.1", 8080));
        while (true){
            //如果连接建立完成，退出循环
            if (channel.finishConnect())
                break;
        }
        //读取数据
        //检查当前选择器注册的通道是否有就绪的事件，如果没有会阻塞
        selector.select();
        //取出所有就绪的通道
        Set<SelectionKey> keys = selector.selectedKeys();
        Iterator<SelectionKey> iterator = keys.iterator();
        while (iterator.hasNext()){
            SelectionKey key = iterator.next();
            //判断通道的就绪事件类型，并针对性的做出处理
            if (key.isReadable()){
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                SocketChannel channel1 = (SocketChannel) key.channel();
                channel1.read(buffer);
                buffer.flip();
                System.out.println(buffer.toString());
                channel1.close();
            }else if (key.isWritable()){
                //....
            }else if (key.isConnectable()){
                //...
            }
        }
        selector.close();
        channel.close();
    }
    public static void server() throws IOException{
        ServerSocketChannel ser = ServerSocketChannel.open();
        ser.bind(new InetSocketAddress( 8080));
        ser.configureBlocking(false);
        //监听端口连接情况
        SocketChannel channel = null;
        while(true){
            channel = ser.accept();
            if (channel != null){
                System.out.println(channel + "连接成功建立");
                //往目标通道写入数据
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                buffer.put("sdfjl".getBytes());
                buffer.flip();
                channel.write(buffer);
                channel.close();
            }
        }

        //使用选择器的服务端
//        ServerSocketChannel ser = ServerSocketChannel.open();
//        Selector selector = Selector.open();
//        ser.bind(new InetSocketAddress( 8080));
//        ser.configureBlocking(false);
//        //监听连接就绪动作
//        ser.register(selector,SelectionKey.OP_ACCEPT);
//        //阻塞直到连接就绪
//        selector.select();
//        //如果阻塞返回，那么说明连接就绪，有新连接进入，获取该服务端套接字实例
//        selector.selectedKeys().iterator().hasNext();
//        SelectionKey key = (SelectionKey)selector.selectedKeys().iterator().next();
//        ServerSocketChannel channel = (ServerSocketChannel)key.channel();
//        while(true){
//        //accept 方法用于返回刚刚建立连接的客户端套接字通道，并且是非阻塞的，如果每次调用没有新连接将返回 null
//            SocketChannel channel1 = channel.accept();
//            if (channel1 != null){
//                System.out.println(channel1 + "连接成功建立");
//                //往目标通道写入数据
//                ByteBuffer buffer = ByteBuffer.allocate(1024);
//                buffer.put("sdfjl".getBytes());
//                buffer.flip();
//                channel1.write(buffer);
//                channel1.close();
//            }
//        }
    }
}
