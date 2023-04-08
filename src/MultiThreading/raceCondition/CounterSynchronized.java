package MultiThreading.raceCondition;

public class CounterSynchronized {
    private long counter=0;
    public long incAndGet(){
        synchronized (this) {
            this.counter++;
            return this.counter;
        }
    }
    public  long get(){
        synchronized (this) {
            return this.counter;
        }
    }

}
