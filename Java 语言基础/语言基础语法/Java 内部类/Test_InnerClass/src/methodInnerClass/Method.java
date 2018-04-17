package methodInnerClass;

public class Method {
    private static String name;
    private int age;

    public void hello(){
        class MyInnerClass{
            public void sayHello(){
                System.out.println(name);
                System.out.println(age);
            }
        }
    }
}
