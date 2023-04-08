package MultiThreading.concurrent.lock;

public class LockTest {
    public static void main(String[] args) {
        Display display = new Display();
        Thread t1 = new Thread(
                ()->{
                    display.display("Dhoni");
                }
        );
        Thread t2 = new Thread(
                ()->{
                    display.display("Youvraj");
                }
        );
        t1.start();
        t2.start();
    }
}
