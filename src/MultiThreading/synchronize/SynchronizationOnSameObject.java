package MultiThreading.synchronize;

public class SynchronizationOnSameObject {
    public static void main(String[] args) {
        Display display = new Display();
        Mythread t1 = new Mythread(display,"Dhoni");
        Mythread t2 = new Mythread(display,"Youvraj");
        t1.start();
        t2.start();
    }
}
       /*
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Dhoni
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        Good Morning :Youvraj
        */
