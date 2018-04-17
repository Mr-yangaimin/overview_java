package methodInnerClass;

public class Method2 {
    public void hello(String name){
        int age = 20;
        class MyInnerClass{
            public void sayHello(){
                System.out.println(name);
                System.out.println(age);
            }
        }
        new MyInnerClass().sayHello();
    }
}
