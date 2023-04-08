package MultiThreading.interThreadCommunication.deadLock;

public class B {
    public synchronized void d2(A a){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        a.last();
    }
    public synchronized void last(){
        System.out.println("B.last");
    }
}
