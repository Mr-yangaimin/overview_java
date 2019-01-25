package hello;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by acer on 2019/1/24.
 */
public class TestScheduledExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(10);

        service.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        },1000, TimeUnit.MILLISECONDS);

        Thread.sleep(2000);

        service.shutdown();

        System.out.println("任务池结束。。。。");

    }
}
