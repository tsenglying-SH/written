package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/3 19:04
 * @Version 1.0
 **/
public class Test {
    public static class TreeNode {
        public String value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(String value) {
            this.value = value;
        }
    }

    // 先序遍历
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.value);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    //中序遍历
    public static void midOrder(TreeNode root) {
        if (root == null) return;
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            while (!stack.isEmpty() || cur != null) {
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                TreeNode pop = stack.pop();
                System.out.print(pop.value);
                if(pop.right!=null) cur=pop.right;
            }
    }

    // 层次遍历
    public static void bfs(TreeNode root){
        if(root==null) return ;
        Queue<TreeNode> que= new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode poll = que.poll();
            System.out.print(poll.value);
            if(poll.left!=null) que.add(poll.left);
            if(poll.right!=null) que.add(poll.right);
        }
    }

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");
        nodeA.left = nodeB;
        nodeA.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeE.left = nodeG;
        nodeC.right = nodeF;
        System.out.println("先序遍历");
        preOrder(nodeA);
        System.out.println();
        System.out.println("中序遍历");
        midOrder(nodeA);
        System.out.println();
        System.out.println("层次遍历");
        bfs(nodeA);
    }
}
