package tree;

import java.util.stream.IntStream;

import static tree.Tree.*;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        Node root = createNode();
        for (int i = size(root); i > 0; i--) {
            levelOrderTraversal(root,i);
            System.out.println();
            levelOrderTraversalUsingQueue(root);
            System.out.println();
        }

    }
}
