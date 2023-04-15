package MultiThreading.volatole;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Atomic {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()-> Stream.iterate(1, p->p+1)
                .limit(1000)
                .mapToInt(p->p)
                .forEach(p->counter.increment()));
        executorService.submit(()->Stream.iterate(1,p->p+1)
                    .limit(1000)
                    .mapToInt(p->p)
                    .forEach(p->counter.increment()));

        boolean result = executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("result: "+result);
        System.out.println(counter.getValue());
    }
}

class Counter{
    private final AtomicInteger atomicCount = new AtomicInteger(0);
    private int i =0;
    public void increment(){
        i = atomicCount.incrementAndGet();
    }
    public  int getValue(){
        return i;
    }
}
