package linkedList.fastAndSlowPointer.cycle;


import linkedList.LinkedList;
import linkedList.Node;

public class CreateCycleAtKthPosition {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.display();
        System.out.println();
        int position = 3;
        Node head = linkedList.makeloop(linkedList.head,position);
    }
}
