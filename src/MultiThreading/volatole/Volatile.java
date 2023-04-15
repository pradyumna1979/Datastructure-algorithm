package MultiThreading.volatole;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Volatile {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->{
            Stream.iterate(1,p->p+1)
                    .limit(1000)
                    .mapToInt(p->p)
                    .forEach(p->counter.increment());
        });
        executorService.submit(()->{
            Stream.iterate(1,p->p+1)
                    .limit(1000)
                    .mapToInt(p->p)
                    .forEach(p->counter.increment());
        });
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println(counter.getValue());
    }
}
class Counter{
    private AtomicInteger count = new AtomicInteger(0);
    public int getValue(){
        return count.get();
    }
    public int increment(){
        return count.getAndIncrement();
    }
}