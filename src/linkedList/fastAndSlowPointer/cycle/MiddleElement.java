package linkedList.fastAndSlowPointer.cycle;

import linkedList.LinkedList;
import linkedList.Node;

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.display(linkedList.head);
        System.out.println();
        Node middleNode = linkedList.middleNode(linkedList.head);
        linkedList.display(middleNode);
        System.out.println();
        linkedList.display(linkedList.head);

    }
}
