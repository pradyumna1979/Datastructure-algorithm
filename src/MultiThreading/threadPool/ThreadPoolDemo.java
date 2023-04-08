package MultiThreading.threadPool;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Runnable producer = ()->{
            int count = 1;
            while(true){
                try {
                    System.out.println(Thread.currentThread().getName() + " : " +count);
                    queue.put(count++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable consumer = ()->{
            while (true){
                try {
                    Integer count=queue.take();
                    System.out.println(Thread.currentThread().getName() + " : " +count);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        executorService.execute(producer);
        executorService.execute(consumer);
        executorService.shutdown();


    }
}
