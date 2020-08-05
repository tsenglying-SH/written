import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Q18
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/5 21:27
 * @Version 1.0
 *【题目描述】
操作给定的二叉树，将其变换为源二叉树的镜像。*/
public class Q18 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    // 非递归法
    public void Mirror(TreeNode root) {
        if(root==null) return;
        Queue<TreeNode> que= new LinkedList<>();
        que.add(root);
        TreeNode temp,node;
        while(!que.isEmpty()){
            node=que.poll();
            temp=node.left;
            node.left=node.right;
            node.right=temp;
            if(node.left!=null) que.add(node.left);
            if(node.right!=null) que.add(node.right);
        }
    }

    //递归法
    public void Mirro2(TreeNode root){
        if(root==null) return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirro2(root.left);
        Mirro2(root.right);
    }
}
