import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 【思路】：
 * 二叉树的层次遍历bfs
 * */
public class Q22 {

    public static class TreeNode {
        public int val = 0;
        public TreeNode left = null;
        public TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    //层次遍历
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null) return arr;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            TreeNode node = qu.poll();
            arr.add(node.val);
            if (node.left != null) qu.add(node.left);
            if (node.right != null) qu.add(node.right);
        }
        return arr;
    }

    //前序遍历
    public static void preOrder(TreeNode root){
        if (root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right= node5;
        node3.left=node6;
        node3.right=node7;
        ArrayList<Integer> integers = PrintFromTopToBottom(node1);
        System.out.println("层次遍历");
        System.out.println(integers);
        System.out.println("前序遍历");
        preOrder(node1);
    }

}
