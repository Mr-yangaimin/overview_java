package com.single;

import org.junit.Test;

/**
 *
 * @author Walker
 * @date 2018/9/12
 */
public class MainTest {

    /**
     * 测试 RUNNABLE 状态下的线程对于中断的响应情况
     * @throws InterruptedException
     */
    @Test
    public void test() throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run(){
                for (int i=0; i<50000; i++){
//                    if (this.isInterrupted())
//                        break;
                    System.out.println("i=" + i);
                }
            }
        };
        thread.start();
        thread.interrupt();

        thread.join();
    }

    /**
     * 测试 WAITING 状态下的线程对于中断请求的响应情况
     * @throws InterruptedException
     */
    @Test
    public void test1() throws InterruptedException {
        Object obj = new Object();
        Thread thread = new Thread(){
            @Override
            public void run(){
                synchronized (obj){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();
        //主线程等待 thread 线程获取 obj 对象锁并阻塞自己到等待队列
        Thread.sleep(2000);
        thread.interrupt();
    }

    @Test
    public void test2() throws InterruptedException {
        Object obj = new Object();
        Thread thread = new Thread(){
            @Override
            public void run(){
                synchronized (obj){
                    //do nothing
                }
            }
        };
        thread.start();
        synchronized (obj){
            Thread.sleep(1000);
            System.out.println(thread.getState());
            thread.interrupt();
        }
    }

}

