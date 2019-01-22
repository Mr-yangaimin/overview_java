package hello;

import java.util.concurrent.*;

public class TestUsingFuture {
    public static void main(String[] arags) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(()-> {
            Thread.sleep(2000);
            return "hello";
        });

        while(!future.isDone()){
            System.out.println("task not done.....");
        }
        String str = future.get();
        System.out.println(str);
        service.shutdown();
    }
}