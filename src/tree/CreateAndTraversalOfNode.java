package tree;

import static tree.Tree.*;

public class CreateAndTraversalOfNode {

    public static void main(String[] args) {
        Node root = createNode();
        inOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }
}
