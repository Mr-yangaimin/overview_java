package TestPrint;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("C:\\Users\\yanga\\Desktop\\note.txt");
        writer.write("hello world ");
        writer.close();
    }
}
