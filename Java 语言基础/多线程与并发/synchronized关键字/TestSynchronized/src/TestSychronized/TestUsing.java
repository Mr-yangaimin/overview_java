package TestSychronized;

import org.junit.Test;

/**
 * Created by Walker on 2018/8/20.
 */
public class TestUsing {

    private static int count;
    private Object obj = new Object();

    @Test
    public void test() throws InterruptedException {
        //创建 100 个线程
        ThreadOne[] threads = new ThreadOne[1000];
        for (int i=0; i<100; i++){
            threads[i] = new ThreadOne();
            threads[i].start();
        }
        //主线程等待所有副线程执行结束
        for (int j=0; j<100; j++){
            threads[j].join();
        }
        System.out.println(count);

    }

    class ThreadOne extends Thread{
        @Override
        public void run(){
            try {
                //模拟多线程随机访问
                //每个线程启动后随机阻塞 [0 - 200ms]
                this.sleep((long) (Math.random() * 200));
                //醒来后为 count 加一
                synchronized (obj){
                    count++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
