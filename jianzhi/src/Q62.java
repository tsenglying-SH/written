import java.util.Stack;

/**
 * @ClassName Q62
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/3 20:45
 * @Version 1.0
 * *
 * 【题目描述】
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）中，
 * 按结点数值大小顺序第三小结点的值为4。
 */
public class Q62 {
    // 节点定义
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode KthNode(TreeNode pRoot, int k){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur= pRoot;
        int count=0;
        while(!stack.isEmpty()||cur!=null){
            // 找到最左边的节点，即为最小值
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            count++;
            TreeNode pop=stack.pop();
            if(count==k) {cur=pop;break;}
            if(pop.right!=null) cur=pop.right;
        }
        return cur;
    }


}
