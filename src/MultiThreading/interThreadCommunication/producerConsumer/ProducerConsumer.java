package MultiThreading.interThreadCommunication.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class  ProducerConsumer {
    Queue<Integer> queue = new LinkedList<>();

    public void produce() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                queue.add(i);
            }
            notify();
        }
    }

    public void consume() {
        synchronized (this) {
            if (queue.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                queue.forEach(System.out::println);
            }
        }
    }
}
