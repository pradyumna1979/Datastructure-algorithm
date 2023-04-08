package MultiThreading.interThreadCommunication;

public class MyThread extends Thread{
    int total=0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("MyThread starts calculation");
        for (int i = 0; i <= 100; i++) {
            total = total+i;
        }
            System.out.println("MyThread trying to give notification");
            this.notify();
        }
    }

}
