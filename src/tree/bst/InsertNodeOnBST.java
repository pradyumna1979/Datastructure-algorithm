package tree.bst;

import tree.Node;

import static tree.Tree.*;

public class InsertNodeOnBST {
    public static void main(String[] args) {
        Node root = createNode();
        Node newRoot = insertNode(root,7);
        inOrderTraversal(newRoot);
    }
}
