package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Walker on 2019/1/27.
 */
public class TestSimpleDateFormat {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    SimpleDateFormat sdf =
                            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    threadLocal.set(sdf);
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long time = Math.abs(new Random().nextLong());
                Date date = new Date(time);
                String str = threadLocal.get().format(date);
                //校验转换前的日期时间与转换后的字符串时间是否匹对
                System.out.println(Thread.currentThread().getName() +
                                ":" + date + "//" +
                                str);
            }).start();
        }
        Thread.sleep(100000);
    }
}
