package testStaticProxy;

public class realClass implements IService {
    @Override
    public void sayHello(){
        System.out.println("hello world.....");
    }

    public void doService(){
        System.out.println("doing service....");
    }
}
