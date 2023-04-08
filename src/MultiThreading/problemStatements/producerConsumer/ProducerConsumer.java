package MultiThreading.problemStatements.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        Object lock = new Object();
        Queue<Integer> queue = new LinkedList<>();
        int SIZE = 10;
        Thread producerThread = new Thread(
                () -> {
                    int count = 1;
                    while (true) {
                        synchronized (lock) {
                            try {
                                while (queue.size() == SIZE)
                                    lock.wait();
                                queue.offer(count++);
                                lock.notifyAll();
                                Thread.sleep(1000);
                                  System.out.println(Thread.currentThread().getName() + " " + count);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
                , "praducer");
        Thread consumerThread = new Thread(
                () -> {
                    while (true) {
                        synchronized (lock) {
                            try {
                                while (queue.size() == 0)
                                    lock.wait();
                                System.out.println(Thread.currentThread().getName()+" "+queue.peek());
                                queue.poll();
                                lock.notifyAll();
                                Thread.sleep(1000);

                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
                , "consumer");

        producerThread.start();
        consumerThread.start();
    }
}
