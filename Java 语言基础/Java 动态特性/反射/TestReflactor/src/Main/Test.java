package Main;

import java.lang.reflect.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//        testField();
//        testMethod();
//        testConstructor();
//        testArray();
//        testAnnotation();
        test();
    }

    //反射泛型信息2
    public static void test(){
        ArrayList<Integer> list = new ArrayList<>();
        Class cls = list.getClass();
        TypeVariable[] variables = cls.getTypeParameters();
        for (TypeVariable v : variables){
            System.out.println(v);
        }
    }

    //反射泛型信息1
    public static void testAnnotation() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        //list.add("fads");编译不通过

        Class<?> cls = list.getClass();
        Method add = cls.getMethod("add",Object.class);
        add.invoke(list,"hello");
        System.out.println(list.get(1));
    }

    //反射数组类
    public static void testArray() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        不能使用常规的 newInstantce 创建一个数组类型实例
//        Class<String[]> cls = String[].class;
//        Constructor constructor = cls.getConstructor();
//        String[] strs = (String[]) constructor.newInstance();

//        使用 Array 类的 newInstance 方法创建一个数组类实例
        String[] strs = (String[]) Array.newInstance(String.class,12);
        System.out.println(strs.length);
    }

    //反射构造器
    public static void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<People> cls = People.class;
        Constructor c = cls.getConstructor();
        People p = (People) c.newInstance();

    }

    //反射方法
    public static void testMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<People> cls = People.class;
        Method sayHello = cls.getMethod("sayHello");
        People people = new People();
        sayHello.invoke(people);
    }

    //反射字段属性
    public static void testField() throws NoSuchFieldException, IllegalAccessException {
        Class<People> cls = People.class;
        Field name = cls.getField("name");
        People people = new People();
        name.set(people,"hello");
        System.out.println(people.name);
    }

}
