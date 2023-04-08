package Queue;

public class QueueOperation {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        try {
            queue.add(5);
            queue.add(4);
            queue.add(3);
            queue.add(2);
            queue.add(1);
            queue.printQueue();
            int element =queue.peek();
            System.out.println();
            System.out.println(element);
            int polled = queue.poll();
            System.out.println(polled);
            System.out.println();
            queue.printQueue();
            queue.add(10);
            System.out.println();
            queue.printQueue();
            queue.add(11);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
