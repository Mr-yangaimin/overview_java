package testDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHanlder implements InvocationHandler {
    private Object realObj;

    public MyHanlder(Object realObj) {
        this.realObj = realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy begainning.....");
        Object result = method.invoke(realObj,args);
        System.out.println("proxy ending.....");
        return result;
    }
}
