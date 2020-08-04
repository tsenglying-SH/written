import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Q38
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/4 8:54
 * @Version 1.0
 *
 * 【题目描述】
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。*/
public class Q38 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    // 非递归，与二叉树按层次打印类似
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        int count=0;
        Queue<TreeNode> que= new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            ArrayList<Integer> list= new ArrayList<>();
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();
                list.add(node.val);
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            count++;
        }
        return  count;
    }

    // 递归法
    public static int TreeDepth2(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=TreeDepth2(root.left);
        int right=TreeDepth2(root.right);
        return Math.max(left,right)+1;
    }

}
