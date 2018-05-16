package TestBuffered;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedInputStream in = new BufferedInputStream
                (new FileInputStream("C:\\Users\\yanga\\Desktop\\test.txt"));
        //读第一个字节的时候，两者的速度是一样的，甚至说前者要稍慢
        long startTime = System.currentTimeMillis();
        in.read();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        FileInputStream inputStream = new FileInputStream("C:\\Users\\yanga\\Desktop\\test.txt");
        long startTime1 = System.currentTimeMillis();
        inputStream.read();
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);

        //继续读的时候，缓冲流的优势就出来了，差距还是很大的
        startTime = System.currentTimeMillis();
        for (int i=0;i<2000;i++)
            in.read();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        startTime1 = System.currentTimeMillis();
        for (int i=0;i<2000;i++)
            inputStream.read();
        endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);
    }
}
