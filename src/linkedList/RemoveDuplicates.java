package linkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(14);
        linkedList.add(10);
        linkedList.add(14);
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(15);
        linkedList.display();
        System.out.println("-------------------------");
        linkedList.removeDuplicates();
        System.out.println("--------------------------");
        linkedList.display();

    }
}
