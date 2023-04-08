package tree;

import static tree.Tree.*;

public class MaxOfTree {

    public static void main(String[] args) {
        Node root = createNode();
        int max = maximum(root);
        System.out.println();
        System.out.println("Size : "+max);
    }
}
