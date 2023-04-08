package MultiThreading.synchronize;

public class SynchronizationOnTwoDiffObj {
    public static void main(String[] args) {
        Display display1 = new Display();
        Display display2 = new Display();

        Mythread t1 = new Mythread(display1,"Dhoni");
        Mythread t2 = new Mythread(display2,"Youvraj");
        t1.start();
        t2.start();
    }
}
       /*
Good Morning :Good Morning :Youvraj
Good Morning :Dhoni
Good Morning :Dhoni
Good Morning :Youvraj
Good Morning :Dhoni
Youvraj
Good Morning :Good Morning :Youvraj
Dhoni
Good Morning :Good Morning :Youvraj
Dhoni
Good Morning :Good Morning :Dhoni
Youvraj
Good Morning :Good Morning :Youvraj
Good Morning :Dhoni
Good Morning :Youvraj
Good Morning :Dhoni
Good Morning :Dhoni
Good Morning :Youvraj
Good Morning :Dhoni
Youvraj
        */
