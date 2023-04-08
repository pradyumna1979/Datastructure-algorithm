package MultiThreading.concurrent.threadPool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Display {
    Lock lock = new ReentrantLock();
    public void display(String name){
        lock.lock();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            System.out.println(ex.getLocalizedMessage());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning "+Thread.currentThread().getName());
            System.out.println(name);
        }
        lock.unlock();
    }
    public void display() {
        lock.lock();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            System.out.println(ex.getLocalizedMessage());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+ " -> "+Thread.currentThread().getName());
        }
        lock.unlock();
    }
}
