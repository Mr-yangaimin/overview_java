package Path_component_accessors;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] a) throws IOException {
        //testGetName();
        //testGetParent();
        testGetCanonicalPath();
    }
    public static void testGetName(){
        File file = new File("C:\\Users\\yanga\\Desktop\\a.txt");
        System.out.println(file.getName());

        File file1 = new File("C:\\Users\\yanga\\Desktop");
        System.out.println(file1.getName());
    }

    public static void testGetParent(){
        File file = new File("C:\\Users\\yanga\\Desktop\\a.txt");
        System.out.println(file.getParent());
    }

    public static void testGetCanonicalPath() throws IOException {
        File file = new File("..\\a.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

        //../表示源文件所在目录的上一级目录，../../表示源文件所在目录的上上级目录，以此类推。
    }
}
