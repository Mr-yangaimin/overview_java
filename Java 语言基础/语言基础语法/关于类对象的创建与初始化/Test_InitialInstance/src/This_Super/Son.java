package This_Super;

public class Son extends Father{
    public String name = "son";

    public void sayHello(){
        System.out.println("hello");
    }
    public void introduce(String name){
        System.out.println("my name is:" + name);

        this.sayHello();
    }

    public void showName(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
