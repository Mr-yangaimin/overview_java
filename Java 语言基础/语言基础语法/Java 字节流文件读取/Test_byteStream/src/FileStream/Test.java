package FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
//        FileInputStream input = new FileInputStream("C:\\Users\\yanga\\Desktop\\test.txt");
//        byte[] buffer = new byte[1024];
//        int len = input.read(buffer);
//        String str = new String(buffer);
//        System.out.println(str);
//        System.out.println(len);
//        input.close();

        FileOutputStream out = new FileOutputStream("C:\\Users\\yanga\\Desktop\\test.txt",false);
        //写入一个整型数值的话，实际上写入的是最低位字节
        out.write(20);
        byte[] buffer = "hello wrold".getBytes();
        out.write(buffer);
        out.close();
    }
}
