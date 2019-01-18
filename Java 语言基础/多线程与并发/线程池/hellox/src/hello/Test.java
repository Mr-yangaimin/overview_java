package hello;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 粗略的比较下线程池与普通模式下的线程创建模式的性能差距
 */
public class Test {
    public static void main(String[] arags) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);

        long startTime = System.nanoTime();   //获取开始时间

        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                int c = count.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + ": " + c);
            });
            threads[i].start();
        }

        for (int i = 0; i < 100; i++) {
            threads[i].join();
        }
        System.out.println(count.get());

        long endTime = System.nanoTime(); //获取结束时间

        System.out.println("程序运行时间： " + (endTime - startTime) + "ns");

        //测试线程池带来的性能
        AtomicInteger x = new AtomicInteger(0);
        long startTime1 = System.nanoTime();   //获取开始时间

        ThreadPoolExecutor pool = new ThreadPoolExecutor
                (5, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        for (int i = 0; i < 100; i++){
            pool.submit(()->{
                int c = x.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + ": " + c);
            });
        }
        pool.shutdown();
        while(!pool.isTerminated()){

        }

        long endTime1 = System.nanoTime(); //获取结束时间
        System.out.println(x.get());
        System.out.println("程序运行时间： " + (endTime1 - startTime1) + "ns");

    }
}