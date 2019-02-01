package hello;

import java.util.concurrent.CountDownLatch;

/**
 * Created by acer on 2019/1/30.
 */
public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        //假设一个商品需要 3 个人拼团
        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++){
            new Thread(()->{
                try {
                    //模拟拼团等待
                    Thread.sleep((long) (Math.random()*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +
                    " 拼团成功。。。。。");
                latch.countDown();
            }).start();
        }

        latch.await();
        System.out.println("三人拼团成功，商家发货！");
    }
}