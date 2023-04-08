package MultiThreading.threadLocal;

public class ThreadLocal {
    public static void main(String[] args) {
        java.lang.ThreadLocal<String>  threadLocal = new java.lang.ThreadLocal<>();
        new Thread(
                ()->{
                    threadLocal.set("THREAD 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    String val=threadLocal.get();
                    System.out.println(val);
                }
        ).start();
        new Thread(
                ()->{
                    threadLocal.set("THREAD 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    String val=threadLocal.get();
                    System.out.println(val);
                }
        ).start();
    }
}
