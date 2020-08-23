package permutationAndCombination;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TT
 * @Description TODO
 * @Author Tsenglying
 * @Date 2020/8/23 11:20
 * @Version 1.0
 **/
public class fullPermutation {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        int len = nums.length;
        if (len == 0) return res;
       // boolean[] used = new boolean[len];
        dfs(nums, len, 0, path,  res);
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, ArrayList<Integer> path,
                            List<List<Integer>> res) {
        if (depth == len) {
            int sum=0;
            for (int i = 0; i <path.size() ; i++) {
                sum+=path.get(i);
            }
            if(sum%3==0){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = 0; i < len; i++) {

            path.add(nums[i]);

            dfs(nums, len, depth + 1, path, res);

            path.remove(path.size() - 1);

        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        List<List<Integer>> permute = permute(a);
        System.out.println(permute);
        System.out.println(permute.size());
    }
}

