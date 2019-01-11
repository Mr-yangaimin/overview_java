package hello;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现生产者、消费者模型
 */
public class ProducerAndConsumer {
    /**
     * 仓库类
     */
    class Repertory {
        public final int LIMIT = 15;
        private volatile AtomicInteger count = new AtomicInteger(0);
        private List<Integer> list = new ArrayList();
        private ReentrantLock lock = new ReentrantLock(true);
        private Condition producerCondition = lock.newCondition();
        private Condition consumerCondition = lock.newCondition();

        public void produce(Integer pro) throws InterruptedException {
            lock.lock();
            while ((list.size() + 1) >= LIMIT) {
                //仓库为满，不得生产
                producerCondition.await();
            }
            list.add(pro);
            consumerCondition.signalAll();
            lock.unlock();
        }

        public Integer consume() throws InterruptedException {
            lock.lock();
            while ((list.size() - 1) <= 0) {
                //仓库为空，不得消费
                consumerCondition.await();
            }
            Integer pro = list.remove(0);
            producerCondition.signalAll();
            lock.unlock();
            return pro;
        }

        public Integer getCount(){
            return this.count.getAndIncrement();
        }
    }

    class Prouducer extends Thread {
        Repertory repertory = null;
        public Prouducer(Repertory res){
            repertory = res;
        }
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep((long) (Math.random() *100));
                    Integer res = repertory.getCount();
                    repertory.produce(res);
                    System.out.println("producer add:" + res);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Consumer extends Thread {
        Repertory repertory = null;
        public Consumer(Repertory res){
            repertory = res;
        }
        @Override
        public void run() {
            Integer obj;
            while(true){
                try {
                    Thread.sleep((long) (Math.random() * 100));
                    obj = repertory.consume();
                    System.out.println("consumer get:" + obj);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test() throws InterruptedException {
        Repertory repertory = new Repertory();
        Thread[] producers = new Thread[100];
        Thread[] consumers = new Thread[100];

        for (int i = 0; i < 100; i++){
            producers[i]  = new Prouducer(repertory);
            producers[i].start();
        }

        for (int  i = 0; i < 100; i++){
            consumers[i]  = new Consumer(repertory);
            consumers[i].start();
        }

        for (int i = 0; i < 100; i++){
            producers[i].join();
        }

        for (int  i = 0; i < 100; i++){
            consumers[i].join();
        }
    }
}
