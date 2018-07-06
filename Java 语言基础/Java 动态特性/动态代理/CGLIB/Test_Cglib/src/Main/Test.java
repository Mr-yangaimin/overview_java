package Main;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Factory;

public class Test {
    public static void main(String[] args){
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
//                "C:\\Users\\yanga\\Desktop");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Student.class);
        enhancer.setCallback(new MyMethodInterceptor());
        Student stu = (Student) enhancer.create();
        stu.sayHello();
        stu.run();
        stu.speak();
        stu.study();

    }
}
