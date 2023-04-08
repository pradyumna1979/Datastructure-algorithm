package linkedList;

import java.util.stream.IntStream;

public class Reverse {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        IntStream.range(1,6).forEach(linkedList::add);
        linkedList.display();
        System.out.println("------------------");
        linkedList.reverse();
        System.out.println("------------------");
        linkedList.display();
    }
}
