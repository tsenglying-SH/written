import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Q77
 * @Description 求所有的组合数即C(n,m),并且输出所有结果。考点：组合数&回溯
 * @Author Tsenglying
 * @Date 2020/8/18 10:21
 * @Version 1.0
 *【给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。】
示例:
输入: n = 4, k = 2
输出:
[
[2,4],
[3,4],
[2,3],
[1,2],
[1,3],
[1,4],
]

来源：力扣（LeetCode）
*/
public class Q77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        if(n<k||n<0||k<0){
            return res;
        }
        dfs(n,k,1,path,res);
        return res;
    }

    private static void dfs(int n, int k, int begin, Stack<Integer> path, List<List<Integer>> res) {
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int j = begin; j <=n ; j++) {
            path.push(j);
            dfs(n,k,j+1,path,res);
            path.pop();
        }
    }


    public static void main(String[] args) {
        int n=4,k=3;
        List<List<Integer>> result = combine(n, k);
        System.out.println(result);
    }
}
