package TestBuffered;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileReader reader = new FileReader("C:\\Users\\yanga\\Desktop\\note.txt");
        FileReader reader2 = new FileReader("C:\\Users\\yanga\\Desktop\\note.txt");
        //读取一个字符耗时比
        BufferedReader bufferedReader = new BufferedReader(reader);
        long start = System.currentTimeMillis();
        System.out.println((char)bufferedReader.read());
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        System.out.println((char)reader2.read());
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

        System.out.println("--------------------------");
        //在缓冲流得到缓冲后，连续读取多个字符耗时比
        char[] buffer = new char[2048];
        start = System.currentTimeMillis();
        Thread.sleep(1000);
        bufferedReader.read(buffer);
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start2 = System.currentTimeMillis();
        Thread.sleep(1000);
        reader2.read(buffer);
        end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
