package MultiThreading.daomenThread;

public class DaemonTest {
    public static void main(String[] args) {
        Thread t = new Thread(
                ()->{
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Daemon Thread");
                    }
                }
        );
        t.setDaemon(true);
        t.start();
        System.out.println("daemon thread terminated");
    }
}
