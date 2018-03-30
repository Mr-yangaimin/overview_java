package StaticDipatch;

public class Hello {
    public void sayHello(Father father){
        System.out.println("hello , i am the father");
    }
    public void sayHello(Daughter daughter){
        System.out.println("hello i am the daughter");
    }
    public void sayHello(Son son){
        System.out.println("hello i am the son");
    }
}
