package tree;

import static tree.Tree.*;

public class HeightOfTree {

    public static void main(String[] args) {
        Node root = createNode();
        int height = height(root);
        System.out.println();
        System.out.println("height : "+height);
    }
}
