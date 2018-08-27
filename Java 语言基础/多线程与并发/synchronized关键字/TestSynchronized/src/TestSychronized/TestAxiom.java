package TestSychronized;

import org.junit.Test;

/**
 * Created by Walker on 2018/8/25.
 */
public class TestAxiom {
    private static boolean flag;
    private static Object obj = new Object();

    @Test
    public void test() throws InterruptedException {
        Thread thread = null;
        synchronized (obj){
            thread = new ThreadTwo();
            thread.start();
//            Thread.sleep(1000);
            flag = true;
        }

        thread.join();
    }

    class ThreadTwo extends Thread{
        @Override
        public void run(){
            synchronized (obj) {
                while (!flag) {

                }
            }
//            synchronized (new Object()) {
//                while (!flag) {
//
//                }
//            }
        }
    }
}
