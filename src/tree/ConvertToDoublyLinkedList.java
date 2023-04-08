  package tree;

import static tree.Tree.createNode;

  public class ConvertToDoublyLinkedList {
    Node prev=null;
    Node head=null;
    public static void main(String[] args) {
        Node root = createNode();
        ConvertToDoublyLinkedList treeToDoublyLinkedList = new ConvertToDoublyLinkedList();
        treeToDoublyLinkedList.convertToLinkedList(root);
    }

    private  void convertToLinkedList(Node root) {
        if(root == null){
            return ;
        }
        convertToLinkedList(root.left);
        if(prev==null){
            head = root;
        }else{
            root.left= prev;
            prev.right=root;
        }
        prev = root;
        convertToLinkedList(root.right);
    }
}
