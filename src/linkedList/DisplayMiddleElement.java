package linkedList;

import java.util.stream.IntStream;

public class DisplayMiddleElement {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        IntStream.range(0,11).forEach(linkedList::add);
        linkedList.display();
        System.out.println("------------------");
        linkedList.displayMiddleElement();

    }
}
