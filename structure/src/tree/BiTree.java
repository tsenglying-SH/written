package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BiTree {
    // 定义节点
    public static class Node {
        public String value;
        public Node left;
        public Node right;
    // 构造函数
        public Node(String value) {
            this.value = value;
        }
    }

    //递归法实现先序遍历
    public static void preOrder(Node root) {
        // 递归出口，根节点为空返回
        if (root == null) return;
        System.out.print(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    //递归法实现中序遍历
    public static void midOrder(Node root) {
        // 递归出口，根节点为空返回
        if (root == null) return;
        midOrder(root.left);
        System.out.print(root.value);
        midOrder(root.right);
    }
    //递归法实现后序遍历
    public static void postOrder(Node root) {
        // 递归出口，根节点为空返回
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value);
    }

    // 非递归法实现先序遍历
    public static void preOrder2(Node root){
        if (root==null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            System.out.print(node.value);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
    }
    // 非递归法实现中序遍历
    public static void midOrder2(Node root){
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur=root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node pop = stack.pop();
            System.out.print(pop.value);
            if(pop.right!=null) cur=pop.right;
        }
    }
    // 非递归实现后续遍历
    public static void postOrder2(Node root){
        if (root==null) return;
        Stack<Node> stack = new Stack<>();
        Stack<Node> stack2= new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            stack2.push(node);
            if(node.left!=null) stack.push(node.left);
            if(node.right!=null) stack.push(node.right);
        }
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().value);
        }
    }

    //层次遍历（BFS)
    public static void bfs(Node root){
        if(root==null) return;
        Queue<Node> qu= new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            Node poll = qu.poll();
            System.out.print(poll.value);
            if(poll.left!=null) qu.add(poll.left);
            if(poll.right!=null) qu.add(poll.right);
        }
    }

    public static void main(String[] args) {
        // 定义二叉树节点
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        nodeA.left = nodeB;
        nodeA.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeE.left = nodeG;
        nodeC.right = nodeF;

        // 递归先序遍历
        System.out.print("先序遍历: ");
        preOrder(nodeA);
        // 递归中序遍历
        System.out.println();
        System.out.print("中序遍历: ");
        midOrder(nodeA);
        // 递归后序遍历
        System.out.println();
        System.out.print("后序遍历: ");
        postOrder(nodeA);

        // 非递归先序
        System.out.println();
        System.out.print("非递归先序遍历: ");
        preOrder2(nodeA);
        // 非递归中序
        System.out.println();
        System.out.print("非递归中序遍历: ");
        midOrder2(nodeA);
        // 非递归后序
        System.out.println();
        System.out.print("非递归后序遍历: ");
        postOrder2(nodeA);

        System.out.println();
        System.out.print("层次遍历: ");
        bfs(nodeA);
    }
}
