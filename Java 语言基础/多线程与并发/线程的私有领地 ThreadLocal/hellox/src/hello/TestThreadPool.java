package hello;

public class TestThreadPool {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) throws Throwable {
        threadLocal.set("hello world!");
        functionA();

    }
    private static void functionA(){
        functionB();
    }
    private static void functionB(){
        functionC();
    }
    private static void functionC(){
        functionD();
    }
    private static void functionD(){
        String str = threadLocal.get();
        System.out.println(str);
    }
}
