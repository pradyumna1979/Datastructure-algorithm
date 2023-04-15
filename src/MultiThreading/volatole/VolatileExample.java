package MultiThreading.volatole;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VolatileExample {
    private volatile  int i;
    public void increment(){
        synchronized (this) {
            ++i;
        }
    }
    public int getValue(){
        return i;
    }
}
class VolatileExampleTest{
    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(()->{
            for (int i = 0; i < 100; i++) {
                example.increment();
            }
        });
        service.submit(()->{
            for (int i = 0; i < 100; i++) {
                example.increment();
            }
        });
        service.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("i value ="+example.getValue());
    }
}
