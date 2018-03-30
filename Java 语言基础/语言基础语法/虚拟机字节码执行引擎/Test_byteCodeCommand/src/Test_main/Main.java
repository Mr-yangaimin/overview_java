package Test_main;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class Main {
    public static void main(String[] args) throws Throwable {
        /*
        静态分派
        * Father son = new Son();
          Father daughter = new Daughter();
          Hello hello = new Hello();
          hello.sayHello(son);
          hello.sayHello(daughter);

          动态分派
          Father son = new Son();
          son.sayHello();

          Object obj = new String("hello-world");
          obj.split("-");

          动态调用
          Object obj = new String("hello-world");
          String[] strs = (String[]) getSubStringMethod(obj).invokeExact("-");
          System.out.println(strs[0]);
        * */
    }

    public static MethodHandle getSubStringMethod(Object obj) throws NoSuchMethodException, IllegalAccessException {
        //定义了一个方法模板，规定了待搜索的方法的返回值和参数类型
        MethodType methodType = MethodType.methodType(String[].class,String.class);
        //查找符合指定方法简单名称和模板信息的方法
        return lookup().findVirtual(obj.getClass(),"split",methodType).bindTo(obj);
    }

    public void sayHello(String name){
        int x = 23;
        int y = 43;
        x++;
        x = y - 2;
        long z = 234;
        x = (int)z;
        String str = new String("hello wrold ");

        Object obj = new String("hello");
        obj.equals("world");
    }
}
