package MultiThreading.interThreadCommunication;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread t2 = new MyThread();
        t2.start();
        synchronized (t2) {
            System.out.println("MainThread trying to call wait method");
            t2.wait();
            System.out.println("MainThread Got notification");
            System.out.println(t2.total);
        }
    }
}
//Exception in thread "main" java.lang.IllegalMonitorStateException
