package tree.bst;

import tree.Node;
import tree.Tree;

import static tree.Tree.search;

public class Search {
    public static void main(String[] args) {
        Node root = Tree.createNode();
        int element = 5;
        boolean isPresent=search(root,5);
        System.out.println(isPresent);
    }
}
