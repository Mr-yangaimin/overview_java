package TestUsing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Walker on 2018/9/4.
 */
public class Repository {
    private List<Integer> list = new ArrayList<>();
    private int limit = 10;  //设置仓库容量上限

    public synchronized void addGoods(int count) throws InterruptedException {
        while(list.size() == limit){
            //达到仓库上限，不能继续生产
            wait();
        }
        list.add(count);
        System.out.println("生产者生产产品：" + count);
        //通知所有的消费者
        notifyAll();
    }

    public synchronized void removeGoods() throws InterruptedException {
        while(list.size() <= 0){
            //仓库中没有产品
            wait();
        }

        int res = list.get(0);
        list.remove(0);
        System.out.println("消费者消费产品：" + res);
        //通知所有的生产者
        notifyAll();
    }
}
