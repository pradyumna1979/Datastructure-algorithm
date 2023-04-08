package MultiThreading.problemStatements.PrintOneTo10;

public class PrintOneToTen {
    private int count =1;
    public void incrementAndPrint(){
        while(count < 10) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() +"  " +count++);
            }
        }
    }

    public static void main(String[] args) {
        PrintOneToTen printOneToTen = new PrintOneToTen();
        Thread t1 = new Thread(printOneToTen::incrementAndPrint,"thread1");
        Thread t2 = new Thread(printOneToTen::incrementAndPrint,"thread2");
        t1.start();
        t2.start();
    }
}

