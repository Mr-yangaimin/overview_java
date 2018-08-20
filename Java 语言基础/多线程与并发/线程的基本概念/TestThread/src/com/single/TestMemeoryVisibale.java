package com.single;

import org.junit.Test;

/**
 * Created by Walker on 2018/8/20.
 */
public class TestMemeoryVisibale {
    private static boolean flag;

    @Test
    public void test() throws InterruptedException {
        ThreadTwo thread = new ThreadTwo();
        thread.start();

        Thread.currentThread().sleep(1000);

        thread.join();
        System.out.println("main is finnished");
    }

    //自定义一个线程类
    class ThreadTwo extends Thread{
        @Override
        public void run(){
            while(!flag)
                System.out.println("hello");
            System.out.println(flag);
        }
    }
}
