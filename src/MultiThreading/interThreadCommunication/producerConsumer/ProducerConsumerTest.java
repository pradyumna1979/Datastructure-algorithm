package MultiThreading.interThreadCommunication.producerConsumer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        ProducerThread producerThread = new ProducerThread(producerConsumer);
        ConsumerThread consumerThread = new ConsumerThread(producerConsumer);
        producerThread.start();
        consumerThread.start();
        /*producerThread.join();
        consumerThread.join();*/
    }
}
