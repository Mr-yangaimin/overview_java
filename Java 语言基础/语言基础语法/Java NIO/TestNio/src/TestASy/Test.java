package TestASy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\yanga\\Desktop\\note.txt");
        AsynchronousFileChannel fileChannel =
                AsynchronousFileChannel.open(path, StandardOpenOption.READ);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        Future future = fileChannel.read(buffer,0);
        while(!future.isDone()){
            System.out.println("reading ....");
        }
        System.out.println("read");
    }
}
