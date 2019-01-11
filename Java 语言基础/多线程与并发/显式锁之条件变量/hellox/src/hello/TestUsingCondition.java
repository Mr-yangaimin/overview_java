package hello;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by acer on 2018/12/29.
 */
public class TestUsingCondition {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                lock.lock();
                System.out.println("preparing waiting.....");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("waiting end.......");

                lock.unlock();
            }
        };
        thread1.start();

        Thread.sleep(1000);
        System.out.println(thread1.getState());

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                lock.lock();
                condition.signal();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(thread1.getState());
                lock.unlock();

            }
        };
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
