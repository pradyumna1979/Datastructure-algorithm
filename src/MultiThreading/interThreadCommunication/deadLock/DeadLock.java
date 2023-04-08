package MultiThreading.interThreadCommunication.deadLock;

public class DeadLock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread t1 = new Thread(
                ()->{
                    a.d1(b);
                }
        );
        Thread t2 = new Thread(
                ()->{
                    b.d2(a);
                }
        );
        t1.start();
        t2.start();
    }
}
