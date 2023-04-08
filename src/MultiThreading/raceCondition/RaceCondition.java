package MultiThreading.raceCondition;

public class RaceCondition {
    public static void main(String[] args) {
        CounterSynchronized counterSynchronized = new CounterSynchronized();
        Thread t1 = new Thread(getRunnable(counterSynchronized,"Thread1 count: "));
        Thread t2 = new Thread(getRunnable(counterSynchronized,"Thread2 count: "));
        t1.start();
        t2.start();
    }

    private static Runnable getRunnable(CounterSynchronized counterSynchronized, String msg) {
        return () -> {
            for (int i = 0; i < 1_000_000 ; i++) {
                counterSynchronized.incAndGet();
            }
            System.out.println(msg + counterSynchronized.get());
        };
    }


}
