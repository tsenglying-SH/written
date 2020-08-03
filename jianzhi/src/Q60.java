import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Q60
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/3 22:14
 * @Version 1.0
 *
 * 【题目描述】
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。*/
public class Q60 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > list2= new ArrayList<>();
        if(pRoot== null) return list2;
        Queue<TreeNode> que= new LinkedList<>();
        que.add(pRoot);
        while(!que.isEmpty()){
            ArrayList<Integer> list= new ArrayList<>();
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();
                list.add(node.val);
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            list2.add(list);
        }
        return list2;
    }
}
/*
【思路】在层序遍历二叉树的基础之上，在while中加个int size = queue.size()*/
