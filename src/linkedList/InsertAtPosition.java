package linkedList;

import java.util.stream.IntStream;

public class InsertAtPosition {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        IntStream.range(0,10).forEach(linkedList::add);
        linkedList.display();
        System.out.println("---------------");
        linkedList.insertAtPosition(5,37);
        linkedList.display();
    }
}
