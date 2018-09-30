package com.yam;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class MainTest {
    private static volatile int count;

    @Test
    public void testVolatile() throws InterruptedException {
        Thread1[] thread1s = new Thread1[100];
        for (int i = 0; i < 100; i++){
            thread1s[i] = new Thread1();
            thread1s[i].start();
        }

        for (int j = 0; j < 100; j++){
            thread1s[j].join();
        }
        System.out.println(count);
    }

    private class Thread1 extends Thread{
        @Override
        public void run(){
            try {
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }

    //构建一个原子类型变量 aCount
    private static volatile AtomicInteger aCount = new AtomicInteger(0);
    @Test
    public void testAtomic() throws InterruptedException {
        Thread2[] threads = new Thread2[100];
        for (int i = 0; i < 100; i++){
            threads[i] = new Thread2();
            threads[i].start();
        }

        for (int i = 0; i < 100; i++){
            threads[i].join();
        }
        System.out.println(aCount.get());
    }

    private class Thread2 extends Thread{
        @Override
        public void run(){
            try {
                Thread.sleep((long) (500 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aCount.getAndIncrement();
        }
    }


}
