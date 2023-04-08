package MultiThreading.interThreadCommunication.producerConsumer;

import java.util.Queue;

public class ConsumerThread extends Thread {
    final ProducerConsumer producerConsumer;

    ConsumerThread(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        producerConsumer.consume();
    }
}

