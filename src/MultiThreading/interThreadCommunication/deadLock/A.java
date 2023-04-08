package MultiThreading.interThreadCommunication.deadLock;

public class A {
    public synchronized void d1(B b){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b.last();
    }
    public synchronized void last(){
        System.out.println("A.last");
    }
}
