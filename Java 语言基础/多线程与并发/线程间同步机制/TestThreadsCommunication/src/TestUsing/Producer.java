package TestUsing;

/**
 * Created by Walker on 2018/9/4.
 */
public class Producer extends Thread{
    Repository repository = null;

    public Producer(Repository p){
        this.repository = p;
    }

    @Override
    public void run(){
        int count = 1;
        while(true){
            try {
                Thread.sleep((long) (Math.random() * 500));
                repository.addGoods(count++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
