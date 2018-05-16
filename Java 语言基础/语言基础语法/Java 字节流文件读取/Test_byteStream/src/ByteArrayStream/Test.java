package ByteArrayStream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //读取一个大小无法估计的文件
        FileInputStream input = new FileInputStream("C:\\Users\\yanga\\Desktop\\test.txt");
        int len = 0;
        byte[] buffer = new byte[1024];
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while((len = (input.read(buffer,0,buffer.length))) != -1){
            out.write(buffer,0,len);
        }
        //最后整个文件的内容都被保存下来了，并且我们不用关心你文件到底是多大的
        //我有动态处理的方法，总是能够存储下来你所有内容的
        String str = out.toString();
        System.out.println(str);
    }
}
