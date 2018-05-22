package TestFileReader;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\yanga\\Desktop\\note.txt");
        char[] str = new char[1024];
        System.out.println(String.valueOf(reader.read()));
        reader.close();

        FileWriter writer = new FileWriter("C:\\Users\\yanga\\Desktop\\note.txt");
        writer.write("hello world");
        writer.close();
    }
}
