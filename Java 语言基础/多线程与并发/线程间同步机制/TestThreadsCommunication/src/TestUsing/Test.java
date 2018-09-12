package TestUsing;

/**
 * Created by Walker on 2018/8/31.
 */
public class Test {
    private static Object lock = new Object();

    @org.junit.Test
    public void testWaitNotify() throws InterruptedException {
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                synchronized (lock){
                    System.out.println("hello");
                }
            }
        };
        thread1.start();
        thread2.start();

        Thread.sleep(2000);

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }

    @org.junit.Test
    public void testSleep() throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();

        Thread.sleep(1000);
        System.out.println(thread.getState());
    }

    @org.junit.Test
    public void testJoin() throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run(){
                for (int i=0; i<1000; i++)
                    System.out.println(i);
            }
        };
        thread.start();

        thread.join();
        System.out.println("main thread finished.....");
    }

    /**
     * 生产者消费者模型实现
     */
    @org.junit.Test
    public void testProducerAndCustomer() throws InterruptedException {
        Repository repository = new Repository();
        Thread producer = new Producer(repository);
        Thread consumer = new Customer(repository);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
        System.out.println("main thread finished..");
    }
}