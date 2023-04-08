package linkedList;

import java.util.stream.IntStream;

public class InsertAtBegining {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        IntStream.range(0,10).forEach(linkedList::add);
        linkedList.display();
        System.out.println("------------------");
        linkedList.insertAtBegining(20);
        linkedList.display();
        linkedList.deleteFromEnd();
    }
}
