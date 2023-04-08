package linkedList;

public class MergeTwoSortedLinkedList  {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(5);
        linkedList1.add(7);
        linkedList1.add(8);
        linkedList1.add(10);
        linkedList1.display();
        System.out.println("");
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(4);
        linkedList2.add(6);
        linkedList2.display();
        System.out.println("");
        Node node = linkedList1.mergeLL(linkedList1.head,linkedList2.head);
        linkedList1.display();
    }



}
