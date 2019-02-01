package hello;

import java.util.concurrent.Semaphore;

public class TestSemaphore {
    public static void main(String[] args) throws Throwable {
        //十个停车位
        Semaphore semaphore = new Semaphore(10,false);
        while (true) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() +
                            "进入停车场，占用一个停车位。");
                    //模拟停车时长
                    Thread.sleep((long) (Math.random() * 1000));

                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() +
                    "离开停车场。。。。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
