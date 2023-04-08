package tree;

import static tree.Tree.*;

public class RightViewTree {
    public static void main(String[] args) {
        Node root = createNode();
        System.out.println("left view");
        leftView(root);
        System.out.println("right view");
        rightView(root);
    }

}
