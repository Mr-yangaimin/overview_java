package DataStream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        DataOutputStream d = new DataOutputStream(
                new FileOutputStream("C:\\Users\\yanga\\Desktop\\test.txt")
        );
        d.writeInt(15);
    }
}
