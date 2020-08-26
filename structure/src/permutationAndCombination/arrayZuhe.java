package permutationAndCombination;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName 给定一个数组，求出其中K个数的组合
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/26 14:48
 * @Version 1.0
 **/
public class arrayZuhe {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        Stack<Integer> path = new Stack<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(arr, k, 0, path, res);
        System.out.println(res);
    }

    private static void dfs(int[] arr, int k, int begin, Stack<Integer> path, ArrayList<ArrayList<Integer>> res) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
        }
        for (int i = begin; i < arr.length; i++) {
            path.add(arr[i]);
            dfs(arr, k, i + 1, path, res);
            path.pop();
        }
    }
}
