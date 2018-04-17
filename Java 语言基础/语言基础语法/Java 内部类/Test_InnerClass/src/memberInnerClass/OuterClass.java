package memberInnerClass;

public class OuterClass {
    private static String tel = "23434324";
    private int age = 23;

    public class MyInnerClass{
        //编译不通过，非静态的内部类是不允许拥有静态的属性和方法的
        //private static String name;
        private String name2 = "hello";

        public void sayHello(){
            System.out.println(tel);
            System.out.println(age);
        }
    }
}
