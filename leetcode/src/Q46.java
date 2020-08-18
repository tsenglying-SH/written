import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Q46
 * @Description 求排列数，并且列出所有组合   考点：排列&回溯
 * @Author Tsenglying
 * @Date 2020/8/18 10:20
 * @Version 1.0
 * 【给定一个 没有重复 数字的序列，返回其所有可能的全排列】
 * 示例:
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * 。
 */
public class Q46 {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len == 0) return res;
        boolean[] used = new boolean[len];
        ArrayList<Integer> path = new ArrayList<>();
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, ArrayList<Integer> path,
                            boolean[] used, List<List<Integer>> res) {
        if (depth == len) {
          res.add(new ArrayList<>(path));
           // res.add(path);
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, len, depth + 1, path, used, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = permute(nums);
        System.out.println(list);
    }

}
