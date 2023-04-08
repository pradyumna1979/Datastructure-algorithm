package tree;

import static tree.Tree.createNode;
import static tree.Tree.*;

public class SizeOfTree {

    public static void main(String[] args) {
        Node root = createNode();
        int size = size(root);
        System.out.println();
        System.out.println("Size : "+size);
    }
}
