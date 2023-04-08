package MultiThreading.interThreadCommunication.producerConsumer;

import java.util.Queue;

public class ProducerThread extends Thread {
    final ProducerConsumer producerConsumer;

    ProducerThread(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        producerConsumer.produce();
    }
}
