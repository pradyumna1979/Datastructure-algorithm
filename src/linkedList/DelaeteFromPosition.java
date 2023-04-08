package linkedList;

import java.util.stream.IntStream;

public class DelaeteFromPosition {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        IntStream.range(0,10).forEach(linkedList::add);
        linkedList.display();
        System.out.println("---------------");
        linkedList.deleteFromPosition(5);
        linkedList.display();
    }
}
