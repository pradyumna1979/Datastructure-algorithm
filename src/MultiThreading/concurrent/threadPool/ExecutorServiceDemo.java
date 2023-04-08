package MultiThreading.concurrent.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        Display display = new Display();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(
                ()->{
                    display.display();
                    display.display("pradyumna");
                }
        );
        executorService.shutdown();
    }
}
