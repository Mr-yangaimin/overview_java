package hello;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by acer on 2019/1/22.
 */
public class TestTimeTask {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        //延迟 1 秒执行任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        },1000);

        Thread.sleep(2000);
        timer.cancel();
    }
}
