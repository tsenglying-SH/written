import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @ClassName T6
 * @Description 先序遍历, 层次遍历
 * @Author TianTian
 * @Date 2020/9/2 23:05
 * @Version 1.0
 **/
public class T6 {
    public static void main(String[] args) {
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        preOrder(A);
        System.out.println();
        bfs(A);
        System.out.println();
        midOrder(A);
    }

    public static class TreeNode {
        public String val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(String val) {
            this.val = val;
        }
    }

    // 先序遍历
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            System.out.print(pop.val);
            if (pop.right != null) stack.push(pop.right);
            if (pop.left != null) stack.push(pop.left);
        }
    }

    // 层次遍历
    public static void bfs(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            TreeNode poll = que.poll();
            System.out.print(poll.val);
            if (poll.left != null) que.add(poll.left);
            if (poll.right != null) que.add(poll.right);
        }
    }

// 中序遍历
    public static void midOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur=root;
        while (!stack.isEmpty()||cur!=null){
            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode pop = stack.pop();
            System.out.print(pop.val);
            if(pop.right!=null) cur=pop.right;
        }
    }

}
