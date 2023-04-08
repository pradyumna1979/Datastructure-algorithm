package tree.bst;

import tree.Node;

import static tree.Tree.*;

public class DeleteNodeOnBST {
    public static void main(String[] args) {
        Node root = createNode();
        Node newRoot = deleteNode(root,7);
        inOrderTraversal(newRoot);
    }
}
