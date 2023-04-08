package linkedList;

import java.util.stream.IntStream;

public class ReverseSublist {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        IntStream.range(1,9).forEach(linkedList::add);
        linkedList.display();
        System.out.println();
        Node node = linkedList.reverseSubList(linkedList.head,3,5);
        linkedList.display(node);

    }
}
