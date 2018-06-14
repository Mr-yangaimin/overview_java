package TestMain;

import sun.nio.ch.FileChannelImpl;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {


    }

    /**
     * 通道、缓存区的基本使用
     * @throws IOException
     * @throws InterruptedException
     */
    public static void testByteBuffer() throws IOException, InterruptedException{
        RandomAccessFile file = new RandomAccessFile
                ("C:\\Users\\yanga\\Desktop\\note.txt","rw");
        FileChannel channel = file.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);

        buffer.flip();
        byte[] res = new byte[1024];
        buffer.get(res,0,buffer.limit());
        System.out.println(new String(res));

        channel.close();
    }
}
