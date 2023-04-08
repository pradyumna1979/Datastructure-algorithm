package MultiThreading.problemStatements.printEvenOdd;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        EvenOddThread evenOddThread1 = new EvenOddThread(0);
        EvenOddThread evenOddThread2 = new EvenOddThread(1);
        Thread evenThread = new Thread(evenOddThread1,"evenThread");
        Thread oddThread = new Thread(evenOddThread2,"oddThread");
        evenThread.start();
        oddThread.start();
    }
}
