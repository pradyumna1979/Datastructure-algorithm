package linkedList;

public class RemoveDuplicatesOptimised {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);

        removeDuplicate(linkedList);
    }

    private static void removeDuplicate(LinkedList linkedList) {
        Node head = linkedList.head;
        Node temp = linkedList.head;
        //linkedList.display();

        while (temp != null & temp.next != null){
            if (temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        head = temp;
        linkedList.display();
    }


}
//1,1,2,2,2,3,3,4,5