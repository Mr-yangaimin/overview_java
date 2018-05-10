package File_operations;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Test {
    public static void main(String[] a) throws IOException {
//        testList();
//        testList2();
        testMd();
    }

    /**
     * 无过滤器的 list 测试
     */
    public static void testList(){
        File file = new File("C:\\Users\\yanga\\Desktop");
        String[] list = file.list();
        for (String str : list){
            System.out.println(str);
        }
    }

    /**
     * 有过滤的 list
     */
    public static void testList2(){
        File file = new File("C:\\Users\\yanga\\Desktop\\test");
        String[] list = file.list(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        // dir 代表的当前 File 对象
                        //name 是当前遍历的文件项的简单名称
                        if (!name.endsWith(".txt"))
                            return false;
                        else
                            return true;
                    }
                }
        );
        for (String str : list){
            System.out.println(str);
        }
    }

    /**
     * 测试创建文件夹相关方法
     */
    public static void testMd() throws IOException {
        File file = new File("C:\\Users\\yanga\\Desktop\\test2");
        System.out.println(file.mkdir());

        File file2 = new File("C:\\Users\\yanga\\Desktop\\test3\\hello");
        System.out.println(file2.mkdir());

        File file3 = new File("C:\\Users\\yanga\\Desktop\\test3\\hello\\231");
        System.out.println(file3.mkdirs());

        //创建临时文件
        File file1 = File.createTempFile("d:\\","hello.txt");
        System.out.println(file1.getName());
    }
}
