package Queue;
public class Queue {
    private int SIZE = 5;
    private int top = -1;
    private final int[] queue;

    public Queue(int SIZE) {
        this.SIZE = SIZE;
        this.queue = new int[SIZE];
    }

    public Queue() {
        this.queue = new int[SIZE];
    }
    public boolean add(int element) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        queue[++top] = element;
        return true;
    }

    public int poll() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int element = queue[0];
        for (int i = 1; i <= top; i++) {
            queue[i-1] = queue[i];
        }

        top--;
        return element;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return queue[0];
    }
    public void printQueue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    private boolean isFull() {
        return top == SIZE-1;
    }
    private boolean isEmpty() {
        return top == -1;
    }
}
