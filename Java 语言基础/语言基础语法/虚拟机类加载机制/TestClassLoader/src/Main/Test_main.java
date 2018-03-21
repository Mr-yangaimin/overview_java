package Main;

import com.single.MyClassLoader;

public class Test_main {
    public static void main(String[] args){
        ClassLoader loader = new MyClassLoader();
        try {
            Class<?> myClass = loader.loadClass("MyPackage.Out");
            System.out.println(myClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
