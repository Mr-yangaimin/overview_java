package hello;

import java.util.concurrent.*;

/**
 * Created by acer on 2019/1/22.
 */
public class TestCompletionService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //分5个 task 进行
        Executor executor = Executors.newFixedThreadPool(10);
        CompletionService<Integer> service =
                new ExecutorCompletionService(executor);
        //计算 1-2000之间的总和
        service.submit(()->{
            int sum = 0;
            for (int i = 1;i <= 2000;i++){
                sum += i;
            }
            return sum;
        });
        //计算 2001-4000之间的总和
        service.submit(()->{
            int sum = 0;
            for (int i = 2001;i <= 4000;i++){
                sum += i;
            }
            return sum;
        });
        //计算 4001-6000之间的总和
        service.submit(()->{
            int sum = 0;
            for (int i = 4001;i <= 6000;i++){
                sum += i;
            }
            return sum;
        });
        //计算 6001-8000之间的总和
        service.submit(()->{
            int sum = 0;
            for (int i = 6001;i <= 8000;i++){
                sum += i;
            }
            return sum;
        });
        //计算 8001-10000之间的总和
        service.submit(()->{
            int sum = 0;
            for (int i = 8001;i <= 10000;i++){
                sum += i;
            }
            return sum;
        });
        int sum = 0;
        for (int i = 0;i < 5;i++){
            Future<Integer> future = service.take();
            if (future != null){
                sum += future.get();
                System.out.println(sum);
            }else{
                i--;
                continue;
            }
        }

        System.out.println(sum);
    }
}
