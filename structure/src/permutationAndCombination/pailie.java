package permutationAndCombination;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName pailie
 * @Description 给出几个数字，求全排列。
 * @Author Tsenglying
 * @Date 2020/8/26 14:30
 * @Version 1.0
 **/
public class pailie {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        boolean[] used= new boolean[arr.length];
        Stack<Integer> path = new Stack<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(arr,arr.length,0,used,path,res);
        System.out.println(res);
        System.out.println(res.size());
    }

    public static void dfs(int[] arr, int len, int depth,boolean[] used, Stack<Integer> path, ArrayList<ArrayList<Integer>> list) {
         if(depth==len){
             list.add(new ArrayList<>(path));
             return;
         }
        for (int i = 0; i <len ; i++) {
            if(!used[i]){
                used[i]=true;
                path.push(arr[i]);
                dfs(arr,arr.length,depth+1,used,path,list);
                path.pop();
                used[i]=false;
            }
        }
    }

}
