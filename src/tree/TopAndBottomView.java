package tree;

import java.util.List;

import static tree.Tree.*;

public class TopAndBottomView {
    public static void main(String[] args) {
        Node root = createNode();
        List<Integer> topViewList = topView(root);
        topViewList.forEach(e-> System.out.print(e+" "));
        System.out.println();
        List<Integer> bottomViewList = bottomView(root);
        bottomViewList.forEach(e-> System.out.print(e+" "));
    }
}
