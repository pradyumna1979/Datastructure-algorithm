package tree.bst;

import tree.Node;

import static tree.Tree.*;

public class MinimumOnBST {
    public static void main(String[] args) {
        Node root = createNode();
        int min = minVal(root);
        System.out.println("min=="+min);
    }
}
