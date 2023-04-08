package MultiThreading.problemStatements.printEvenOdd;

public class EvenOddThread implements Runnable {
    static int count=1;
    final int reminder;
    static Object lock = new Object();
    public EvenOddThread(int reminder) {
        this.reminder = reminder;
    }
    private void print(){

        System.out.println(Thread.currentThread().getName() + " " + count++);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (lock) {
                while (count % 2 != reminder)
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                print();
                lock.notifyAll();
            }
        }

    }
}
