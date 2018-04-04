package RefCountingTest;

public class Test {
    public static void main(String[] args){
        //Java 并没有采用引用计数算法判断对象存活性
        A obj1 = new A();
        B obj2 = new B();
        obj1.setbRef(obj2);
        obj2.setaRef(obj1);

        obj1 = null;
        obj2 = null;
        System.gc();
    }
}
