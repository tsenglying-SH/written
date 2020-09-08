package byteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName M1
 * @Description TODO
 *
 * @Author Tsenglying
 * @Date 2020/8/23 9:25
 * @Version 1.0
 **/
public class T1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int L= sc.nextInt();
        int R= sc.nextInt();
        sc.close();
        long mod = 1000000007L;
        long a= findArr(N,L,R);
        a=a%mod;
        System.out.println(a);
    }

    private static long findArr(int n, int L, int R) {
        if(L>R) return 0;
        if(n<=0) return 0;
        if(L==R){
          if(n*L%3==0){
              return 1;
          }
        }
        long count=0L;
        int[] nums= new int[R-L+1];
        for (int i = 0; i <R-L+1 ; i++) {
            nums[i]=L+i;
        }
    //    System.out.println(Arrays.toString(nums));
        List<List<Integer>> permute = permute(nums,n);
    //    System.out.println(permute);
        return permute.size();
    }
    public static List<List<Integer>> permute(int[] nums,int len) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();

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
        for (int i = 0; i < nums.length; i++) {

            path.add(nums[i]);

            dfs(nums, len, depth + 1, path, res);

            path.remove(path.size() - 1);

        }
    }
}
