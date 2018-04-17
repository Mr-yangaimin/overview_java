package staticInnerClass;

public class OuterClass {
    private static String name = "hello world";
    private int age = 23;

    public static class MyInnerClass{
        private static String myName = "single";
        private int myAge = 23;

        public void sayHello(){
            System.out.println(name);
            //编译器报错提示：不可访问的字段 age
            //System.out.println(age);
        }
    }
}
