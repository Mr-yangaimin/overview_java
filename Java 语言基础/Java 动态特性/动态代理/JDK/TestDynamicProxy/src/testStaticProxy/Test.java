package testStaticProxy;

public class Test {
    public static void main(String[] args){
        realClass realClass = new realClass();
        ProxyClass proxyClass = new ProxyClass(realClass);
        proxyClass.sayHello();
        proxyClass.doService();
    }
}
