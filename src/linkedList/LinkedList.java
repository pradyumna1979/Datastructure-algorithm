package linkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {
    public Node head = null;
    Node newNode = null;
    public Node temp = null;

    public LinkedList() {
    }

    public void add(int data){

        newNode = new Node(data);
        if(head == null){
          head =  temp = newNode;
        }else{
            temp.next = newNode;
            temp = newNode;
        }
    }
    public  Node makeloop( Node head_ref, int k)
    {
        // traverse the linked list until loop
        // point not found
        Node temp = head_ref;
        int count = 1;
        while (count < k)
        {
            temp = temp.next;
            count++;
        }

        // backup the joint point
        Node joint_point = temp;

        // traverse remaining nodes
        while (temp.next != null)
            temp = temp.next;

        // joint the last node to k-th element
        temp.next = joint_point;
        return head_ref;
    }
    public void display(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
    }

    public void removeDuplicates(){
        temp = head;
        Node previous = null;
        Set<Integer> dataSet = new HashSet<>();
        while(temp != null){
          if(dataSet.contains(temp.data))  {
              previous.next = temp.next;
          }
          else{
             dataSet.add(temp.data);
             previous = temp;
          }
          temp = temp.next;
        }
    }
    public void deleteFromBegining(){
        head = head.next;
    }

    public void deleteFromEnd() {
        Node temp = head;
        Node previous = null;
        while(temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
    }

    public void deleteFromPosition(int position) {
        Node current = head;
        Node previous = null;
        int count = 0;
        while(current.next != null && count < position){
            count++;
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }

    public void insertAtBegining(int data) {
         Node newNode = new Node(data);
         Node temp = head;
         if(temp == null){
             head = temp = newNode;
         }else{
             newNode.next = temp;
             head = newNode;
         }
    }

    public void insertAtEnd(int data) {
        Node temp = head;
        Node newNode = new Node(20);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        temp = newNode;
    }

    public void insertAtPosition(int position, int data) {
        Node current = head;
        Node previous = null;
        Node newNode = new Node(data);
        int count = 0;
        while(current.next != null && count < position){
            count++;
            previous = current;
            current = current.next;
        }
        previous.next=newNode;
        previous.next.next=current;

    }

    public void displayMiddleElement() {
        Node faster = head;
        Node slower = head;
        while(faster != null && faster.next != null && slower.next != null ){
            faster = faster.next.next;
            slower = slower.next;
        }
        System.out.println(slower.data);
    }

    public void reverse() {
        Node currentNode = head,nextNode = head;
        Node previousNode = null;
        while(nextNode != null){
            nextNode = nextNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }

    public Node reverse(Node node) {
        Node currentNode = node,nextNode = node;
        Node previousNode = null;
        while(nextNode != null){
            nextNode = nextNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
        return head;
    }
    public  boolean isCyclePresent(Node  head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public  int lengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        slow = slow.next;
        int count = 1;
        while(fast != slow){
            slow = slow.next;
            count++;
        }
        System.out.println(count);
        return count;
    }
    public int positionOfCycleStart(Node head_ref) {
        Node temp = head_ref;
        Node f = head_ref;
        Node s = head_ref;
        int length = lengthOfCycle(temp);
        while(length >0){
            f = f.next;
            length--;
        }
        int position = 1;
        while(f != s){
            f = f.next;
            s = s.next;
            position++;
        }
        return position;
    }

    public Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        Node previous = null;
        while(slow != null && fast != null && fast.next !=null){
            fast = fast.next.next;
            previous = slow;
            slow = slow.next;
        }
        previous.next=null;
        return slow;
    }
    public int positionOfMiddleNode(Node head) {
        Node fast = head;
        Node slow = head;
        int count =1;
        while(slow != null && fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            count ++;
        }
        return count;
    }

    public void display(Node node) {
        Node temp = node;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public  Node mergeLL(Node node1, Node node2) {
        LinkedList mergedList = new LinkedList();

        if(node1==null && node2 == null){
            return null;
        } else if (node1 == null) {
            return node2;
        } else if (node2 == null) {
            return node1;
        }else {
            while (node1 != null && node2 != null){
                if(node1.data == node2.data){
                    mergedList.add(node1.data);
                    mergedList.add(node2.data);
                    node1 = node1.next;
                    node2 = node2.next;
                } else if (node1.data > node2.data) {
                    mergedList.add(node2.data);
                    node2 = node2.next;
                }else {
                    mergedList.add(node1.data);
                    node1 = node1.next;
                }
            }
            while(node1 != null){
                mergedList.add(node1.data);
                node1 = node1.next;
            }
            while(node2 != null){
                mergedList.add(node2.data);
                node2 = node2.next;
            }
        }
        return mergedList.head;
    }

    public Node sort(Node head) {
        if(head.next == null){
            return head;
        }
        Node mid = middleNode(head);
        Node left = sort(head);
        Node right = sort(mid);
        return mergeLL(left,right);
    }

    public Node reverseSubList(Node head, int m, int n) {
        if (m == n)
            return head;

        // revs and revend is start and end respectively of the
        // portion of the linked list which need to be reversed.
        // revs_prev is previous of starting position and
        // revend_next is next of end of list to be reversed.
        Node revs = null, revs_prev = null;
        Node revend = null, revend_next = null;

        // Find values of above pointers.
        int i = 1;
        Node curr = head;
        while (curr!=null && i <= n) {
            if (i < m)
                revs_prev = curr;
            if (i == m)
                revs = curr;
            if (i == n) {
                revend = curr;
                revend_next = curr.next;
            }
            curr = curr.next;
            i++;
        }
        revend.next = null;
        // Reverse linked list starting with revs.
        revend = reverse(revs);
        // If starting position was not head
        if (revs_prev!=null)
            revs_prev.next = revend;
            // If starting position was head
        else
            head = revend;
        revs.next = revend_next;
        return head;
    }
}
