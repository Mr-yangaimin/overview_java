package TestUsing;

/**
 * Created by Walker on 2018/9/4.
 */
public class Customer extends Thread{
    Repository repository = null;

    public Customer(Repository p){
        this.repository = p;
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep((long) (Math.random() * 500));
                repository.removeGoods();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
