package permutationAndCombination;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName zuhe
 * @Description 组合数,给定数组长度为n的数组，求出其中m个数字的组合
 * @Author Tsenglying
 * @Date 2020/8/26 14:47
 * @Version 1.0
 **/
public class zuhe {
    public static void main(String[] args) {
        int n=10;
        int k=2;
        Stack<Integer> path= new Stack<>();
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        dfs(n,k,1,path,res);
        System.out.println(res);
        System.out.println(res.size());

    }
    public static void dfs(int n , int k, int begin, Stack<Integer> path, ArrayList<ArrayList<Integer>> res){
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n; i++) {
            path.push(i);
            dfs(n,k,i+1,path,res);
            path.pop();
        }
    }
}
