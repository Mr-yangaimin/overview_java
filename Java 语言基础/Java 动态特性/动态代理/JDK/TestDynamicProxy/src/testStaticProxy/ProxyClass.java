package testStaticProxy;

public class ProxyClass implements IService{
    private realClass realClass;

    public ProxyClass(realClass realClass){
        this.realClass = realClass;
    }
    @Override
    public void sayHello() {
        System.out.println("i am proxy，prepare for saying hello...");
        realClass.sayHello();
        System.out.println("i am proxy,saying hello ending....");
    }

    public void doService(){
        System.out.println("i am proxy，prepare for doing services...");
        realClass.doService();
        System.out.println("i am proxy,doing services ending....");
    }
}
