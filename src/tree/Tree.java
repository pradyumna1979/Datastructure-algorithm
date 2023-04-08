package tree;

import java.util.*;

public class Tree {
    static Scanner sc=new Scanner(System.in);
    public static Node createNode() {
        Node root;
        System.out.println("Enter Data :");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left data:");
        root.left = createNode();
        System.out.println("Enter right data:");
        root.right=createNode();
        return  root;
    }
    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    static void levelOrderTraversal(Node root, int level){
        if(root == null){
            return;
        }
        if(level==1){
            System.out.print(root.data + " ");
        }
        if (level > 1) {
            levelOrderTraversal(root.left,level-1);
            levelOrderTraversal(root.right,level-1);
        }

    }
    static void levelOrderTraversalUsingQueue(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node node;
        while(!queue.isEmpty()) {
            node = queue.poll();
            System.out.print(node.data+ "");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    static int height(Node root){
        if(root == null){
           return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
    static int size(Node root){
         if(root == null){
             return 0;
         }
         return size(root.left) +size (root.right) +1;
    }
    static int maximum(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    static void leftView(Node root){
        Node[] array = new Node[height(root)];
        printLeftView(root,array,0);
        for (Node node:array) {
            System.out.print(node.data+" ");
        }
    }
    static void rightView(Node root){
        Node[] array = new Node[height(root)];
        printRightView(root,array,0);
        for (Node node:array) {
            System.out.print(node.data + " ");
        }
    }

    private static void printLeftView(Node root, Node[] array, int level) {
       if(root == null){
           return;
       }
       if(array[level] == null) {
           array[level] = root;
       }
       printLeftView(root.left,array,level+1);
       printLeftView(root.right,array,level+1);
    }

    private static void printRightView(Node root, Node[] array, int level) {
        if(root == null){
            return;
        }
        if(array[level] == null){
            array[level]=root;
        }
        printRightView(root.right,array,level+1);
        printRightView(root.left,array,level+1);
    }
    static List<Integer> topView(Node root){
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0,root));
        Map<Integer, Integer> map = new TreeMap<>();
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            map.putIfAbsent( curr.rd,  curr.node.data);
            if(curr.node.left != null){
                queue.add(new Pair(curr.rd-1,curr.node.left));
            }
            if(curr.node.right != null){
                queue.add(new Pair(curr.rd+1,curr.node.right));
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
           list.add(entry.getValue());
        }
        return  list;
    }
    static List<Integer> bottomView(Node root){
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0,root));
        Map<Integer, Integer> map = new TreeMap<>();
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            map.put( curr.rd,  curr.node.data);
            if(curr.node.left != null){
                queue.add(new Pair(curr.rd-1,curr.node.left));
            }
            if(curr.node.right != null){
                queue.add(new Pair(curr.rd+1,curr.node.right));
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
           list.add(entry.getValue());
        }
        return  list;
    }
    static int diameter(Node root){
       if(root == null) return 0;
       int leftDiameter = diameter(root.left);
       int rightDiameter = diameter(root.right);
       int currDiameter = height(root.left)+height(root.right)+1;
       return Math.max(currDiameter,Math.max(leftDiameter,rightDiameter));
    }

    public static boolean search(Node root, int target) {
        if(root == null)
            return false;
        if(target == root.data){
          return true;
        }
        if (target < root.data) {
            return search(root.left,target);
        }
        return search(root.right,target);

    }
    public static Node insertNode(Node root, int target){
        if(root == null){
            return new Node(target);
        }
        if(target < root.data){
            root.left = insertNode(root.left,target);
        }else if(target > root.data){
            root.right = insertNode(root.right, target);
        }
        return root;
    }
    public static Node deleteNode(Node root,int element){
        if(root == null)
            return root;
        if (element > root.data){
            root.right = deleteNode(root.right,element);
        } else if (element < root.data) {
           root.left = deleteNode(root.left,element);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return  root.left;
            }
            root.data = minVal(root.right);
            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }

    public static int minVal(Node root) {
        while(root.left != null){
           root = root.left;
        }
        return root.data;
    }
    public static boolean isBST(Node root, int minVal, int maxVal){
        if(root == null) return true;
        if(root.data >= maxVal || root.data <= minVal) return false;
        return isBST(root.left,minVal,root.data) && isBST(root.left,root.data,maxVal);
    }
}
