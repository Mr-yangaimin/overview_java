package hello;

public class TestThreadLocalInSpring {
    public static void main(String[] args){
        ThreadLocal threadLocal = new ThreadLocal();

        threadLocal.set("hello");
    }
}
