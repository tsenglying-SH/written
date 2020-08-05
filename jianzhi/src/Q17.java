/**
 * @ClassName Q17
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/5 20:08
 * @Version 1.0
 * 【题目】
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Q17 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        if (root1.val == root2.val) {
            if (judge(root1, root2)) return true;
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public boolean judge(TreeNode root, TreeNode subtree) {
        if (subtree == null) return true;
        if (root == null) return false;
        if (root.val == subtree.val) {
            return judge(root.left, subtree.left) && judge(root.right, subtree.right);
        }
        return false;
    }
}
/*'【思路】 递归法
1.首先需要判断A,B的根节点是否一样。
2.如果不一样，判断A的左孩子和B的根节点是否一样，同理可判断A的右孩子和B的根节点是否一样。依次找下去
如果上述情况都不满足则说明不包含
1.如果找到了A中有值和B中的根节点相同，则比较左右子树是否相同。
2.如果B为空了，则说明包含
3.如果A为空了，则说明不包含*/