package linkedList.fastAndSlowPointer.cycle;

import linkedList.LinkedList;
import linkedList.Node;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.display(linkedList.head);
        System.out.println();
        Node node = linkedList.sort(linkedList.head);
        linkedList.display(node);
    }
}
