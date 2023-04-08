package tree.bst;

import tree.Node;
import tree.Tree;

public class IsBST {
    public static void main(String[] args) {
        Node root = Tree.createNode();
        boolean isBST=Tree.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(isBST);
    }
}
