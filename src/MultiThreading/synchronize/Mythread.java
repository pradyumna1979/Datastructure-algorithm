package MultiThreading.synchronize;

public class Mythread extends Thread{
    private Display display;
    private String name;
    public Mythread(Display display, String name){
        this.display = display;
        this.name = name;
    }
    @Override
    public void run() {
        display.wish(name);
    }
}
