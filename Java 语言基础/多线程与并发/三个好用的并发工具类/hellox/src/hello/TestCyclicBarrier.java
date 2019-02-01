package hello;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by acer on 2019/1/31.
 */
public class TestCyclicBarrier {
    static Integer count = 0;

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(20, () -> {
            if (count == 0) {
                System.out.println("班车准备开始运营~");
                count++;
            }else{
                System.out.println("车上座位已经满，请等待下一班！");
                count++;
            }
        });
        //公寓有一百个人
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    //模拟起床耗时
                    Thread.sleep((long) (Math.random() * 1000));
                    barrier.await();

                    System.out.println(Thread.currentThread().getName() +
                            " 赶上了第 " + count + "趟班车。。。");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }

            }).start();
        }
    }
}
