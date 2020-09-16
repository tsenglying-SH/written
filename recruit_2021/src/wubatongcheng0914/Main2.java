package wubatongcheng0914;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @ClassName Main1
 * @Description 二叉树层次遍历
 * @Author TianTian
 * @Date 2020/9/14 19:32
 * @Version 1.0
 **/
public class Main2 {
    // 定义节点
    public static class TreeNode{
        public Integer val;
        public TreeNode left;
        public TreeNode right;
        // 构造函数
        public TreeNode(Integer value) {
            this.val = value;
        }
    }

    public ArrayList<ArrayList<Integer>> printNode (TreeNode node){
        ArrayList<ArrayList<Integer> > list= new ArrayList<>();
        if(node== null) return list;
        Queue<TreeNode> que= new LinkedList<>();
        que.add(node);
        while(!que.isEmpty()){
            ArrayList<Integer> list1= new ArrayList<>();
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode node1=que.poll();
                list1.add( node1.val);
                if(node1.left!=null) que.add(node1.left);
                if(node1.right!=null) que.add(node1.right);
            }
            list.add(list1);
        }
        return list;
    }

}
