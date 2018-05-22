package TestCharArray;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        FileReader fileReader = new FileReader("C:\\Users\\yanga\\Desktop\\note.txt");
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = fileReader.read(buffer)) != -1){
            writer.write(buffer,0,len);
        }
        System.out.println(writer.toString());
    }
}
