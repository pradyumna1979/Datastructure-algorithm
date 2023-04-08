package tree;

import static tree.Tree.*;

public class Diameter {

    public static void main(String[] args) {
        Node root = createNode();
        int diameter = diameter(root);
        System.out.println(diameter);
    }
}
