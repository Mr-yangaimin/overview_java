package testDynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        realClass rc = new realClass();
        MyHanlder hanlder = new MyHanlder(rc);
        IService obj = (IService)Proxy.newProxyInstance(
                rc.getClass().getClassLoader(),
                new Class[]{IService.class},
                hanlder);
        obj.sayHello();
    }
}
