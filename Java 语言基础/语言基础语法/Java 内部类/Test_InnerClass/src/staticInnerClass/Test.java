package staticInnerClass;

public class Test {
    public static void main(String[] args){
        //创建静态内部类实例
        OuterClass.MyInnerClass innerClass = new OuterClass.MyInnerClass();
        innerClass.sayHello();

        Integer in = new Integer(23);
    }
}
